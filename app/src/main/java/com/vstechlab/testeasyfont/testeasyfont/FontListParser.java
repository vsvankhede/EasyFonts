package com.vstechlab.testeasyfont.testeasyfont;

import android.util.Xml;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 * Helper class to get the current font families on an Android device.</p>
 *
 * http://stackoverflow.com/questions/12128331/how-to-change-fontfamily-of-textview-in-android
 *
 * Usage:</p> {@code List<SystemFont> fonts = FontListParser.safelyGetSystemFonts();}</p>
 */
public final class FontListParser {

    private static final File FONTS_XML = new File("/system/etc/fonts.xml");

    private static final File SYSTEM_FONTS_XML = new File("/system/etc/system_fonts.xml");

    public static List<SystemFont> getSystemFonts() throws Exception {
        String fontsXml;
        if (FONTS_XML.exists()) {
            fontsXml = FONTS_XML.getAbsolutePath();
        } else if (SYSTEM_FONTS_XML.exists()) {
            fontsXml = SYSTEM_FONTS_XML.getAbsolutePath();
        } else {
            throw new RuntimeException("fonts.xml does not exist on this system");
        }
        Config parser = parse(new FileInputStream(fontsXml));
        List<SystemFont> fonts = new ArrayList<>();

        for (Family family : parser.families) {
            if (family.name != null) {
                Font font = null;
                for (Font f : family.fonts) {
                    font = f;
                    if (f.weight == 400) {
                        break;
                    }
                }
                SystemFont systemFont = new SystemFont(family.name, font.fontName);
                if (fonts.contains(systemFont)) {
                    continue;
                }
                fonts.add(new SystemFont(family.name, font.fontName));
            }
        }

        for (Alias alias : parser.aliases) {
            if (alias.name == null || alias.toName == null || alias.weight == 0) {
                continue;
            }
            for (Family family : parser.families) {
                if (family.name == null || !family.name.equals(alias.toName)) {
                    continue;
                }
                for (Font font : family.fonts) {
                    if (font.weight == alias.weight) {
                        fonts.add(new SystemFont(alias.name, font.fontName));
                        break;
                    }
                }
            }
        }

        if (fonts.isEmpty()) {
            throw new Exception("No system fonts found.");
        }

        Collections.sort(fonts, new Comparator<SystemFont>() {

            @Override
            public int compare(SystemFont font1, SystemFont font2) {
                return font1.name.compareToIgnoreCase(font2.name);
            }

        });

        return fonts;
    }

    public static List<SystemFont> safelyGetSystemFonts() {
        try {
            return getSystemFonts();
        } catch (Exception e) {
            String[][] defaultSystemFonts = {
                    {
                            "cursive", "DancingScript-Regular.ttf"
                    }, {
                    "monospace", "DroidSansMono.ttf"
            }, {
                    "sans-serif", "Roboto-Regular.ttf"
            }, {
                    "sans-serif-light", "Roboto-Light.ttf"
            }, {
                    "sans-serif-medium", "Roboto-Medium.ttf"
            }, {
                    "sans-serif-black", "Roboto-Black.ttf"
            }, {
                    "sans-serif-condensed", "RobotoCondensed-Regular.ttf"
            }, {
                    "sans-serif-thin", "Roboto-Thin.ttf"
            }, {
                    "serif", "NotoSerif-Regular.ttf"
            }
            };
            List<SystemFont> fonts = new ArrayList<>();
            for (String[] names : defaultSystemFonts) {
                File file = new File("/system/fonts", names[1]);
                if (file.exists()) {
                    fonts.add(new SystemFont(names[0], file.getAbsolutePath()));
                }
            }
            return fonts;
        }
    }

    /* Parse fallback list (no names) */
    public static Config parse(InputStream in) throws XmlPullParserException, IOException {
        try {
            XmlPullParser parser = Xml.newPullParser();
            parser.setInput(in, null);
            parser.nextTag();
            return readFamilies(parser);
        } finally {
            in.close();
        }
    }

    private static Alias readAlias(XmlPullParser parser) throws XmlPullParserException, IOException {
        Alias alias = new Alias();
        alias.name = parser.getAttributeValue(null, "name");
        alias.toName = parser.getAttributeValue(null, "to");
        String weightStr = parser.getAttributeValue(null, "weight");
        if (weightStr == null) {
            alias.weight = 0;
        } else {
            alias.weight = Integer.parseInt(weightStr);
        }
        skip(parser); // alias tag is empty, ignore any contents and consume end tag
        return alias;
    }

    private static Config readFamilies(XmlPullParser parser) throws XmlPullParserException,
            IOException {
        Config config = new Config();
        parser.require(XmlPullParser.START_TAG, null, "familyset");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            if (parser.getName().equals("family")) {
                config.families.add(readFamily(parser));
            } else if (parser.getName().equals("alias")) {
                config.aliases.add(readAlias(parser));
            } else {
                skip(parser);
            }
        }
        return config;
    }

    private static Family readFamily(XmlPullParser parser) throws XmlPullParserException,
            IOException {
        String name = parser.getAttributeValue(null, "name");
        String lang = parser.getAttributeValue(null, "lang");
        String variant = parser.getAttributeValue(null, "variant");
        List<Font> fonts = new ArrayList<Font>();
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String tag = parser.getName();
            if (tag.equals("font")) {
                String weightStr = parser.getAttributeValue(null, "weight");
                int weight = weightStr == null ? 400 : Integer.parseInt(weightStr);
                boolean isItalic = "italic".equals(parser.getAttributeValue(null, "style"));
                String filename = parser.nextText();
                String fullFilename = "/system/fonts/" + filename;
                fonts.add(new Font(fullFilename, weight, isItalic));
            } else {
                skip(parser);
            }
        }
        return new Family(name, fonts, lang, variant);
    }

    private static void skip(XmlPullParser parser) throws XmlPullParserException, IOException {
        int depth = 1;
        while (depth > 0) {
            switch (parser.next()) {
                case XmlPullParser.START_TAG:
                    depth++;
                    break;
                case XmlPullParser.END_TAG:
                    depth--;
                    break;
            }
        }
    }

    private FontListParser() {

    }

    public static class Alias {

        public String name;

        public String toName;

        public int weight;
    }

    public static class Config {

        public List<Alias> aliases;

        public List<Family> families;

        Config() {
            families = new ArrayList<Family>();
            aliases = new ArrayList<Alias>();
        }

    }

    public static class Family {

        public List<Font> fonts;

        public String lang;

        public String name;

        public String variant;

        public Family(String name, List<Font> fonts, String lang, String variant) {
            this.name = name;
            this.fonts = fonts;
            this.lang = lang;
            this.variant = variant;
        }

    }

    public static class Font {

        public String fontName;

        public boolean isItalic;

        public int weight;

        Font(String fontName, int weight, boolean isItalic) {
            this.fontName = fontName;
            this.weight = weight;
            this.isItalic = isItalic;
        }

    }

    public static class SystemFont {

        public String name;

        public String path;

        public SystemFont(String name, String path) {
            this.name = name;
            this.path = path;
        }

    }
}