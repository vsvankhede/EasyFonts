package com.vstechlab.testeasyfont.easyfonts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Set font typeface for the textview
 */
public final class EasyFonts {
    static byte[] sBuffer;
    static BufferedOutputStream sBOutStream;
    static InputStream sInputStream;
    static String sOutPath;
    static Typeface sResTypeface;
    private static String TAG = "EastFonts";

    private static Typeface sRobotoThin;
    private static Typeface sRobotoBlack;
    private static Typeface sRobotoBlackItalic;
    private static Typeface sRobotoBold;
    private static Typeface sRobotoBoldItalic;
    private static Typeface sRobotoItalic;
    private static Typeface sRobotoLight;
    private static Typeface sRobotoLightItalic;
    private static Typeface sRobotoMedium;
    private static Typeface sRobotoMediumItalic;
    private static Typeface sRobotoRegular;
    private static Typeface sRobotoThinItalic;

    private static Typeface sRecognition;

    private static Typeface sAndroidNation;
    private static Typeface sAndroidNationBold;
    private static Typeface sAndroidNationItalic;

    private static Typeface sDroidSerifRegular;
    private static Typeface sDroidSerifBold;
    private static Typeface sDroidSerifBoldItalic;
    private static Typeface sDroidSerifItalic;

    private static Typeface sFreedom;

    private static Typeface sDroidRobot;

    private static Typeface sFunRaiser;

    private static Typeface sGreenAvocado;

    private EasyFonts(){}


    public static Typeface robotoThin(Context context){
        sRobotoThin = getFontFromRes(R.raw.roboto_thin, context);
        return sRobotoThin;
    }
    public static Typeface robotoBlack(Context context){
        sRobotoBlack = getFontFromRes(R.raw.roboto_black, context);
        return sRobotoBlack;
    }
    public static Typeface robotoBlackItalic(Context context){
        sRobotoBlackItalic = getFontFromRes(R.raw.roboto_blackitalic, context);
        return sRobotoBlackItalic;
    }
    public static Typeface robotoBold(Context context){
        sRobotoBold = getFontFromRes(R.raw.roboto_bold, context);
        return sRobotoBold;
    }
    public static Typeface robotoBoldItalic(Context context){
        sRobotoBoldItalic = getFontFromRes(R.raw.roboto_bolditalic, context);
        return sRobotoBoldItalic;
    }
    public static Typeface robotoItalic(Context context){
        sRobotoItalic = getFontFromRes(R.raw.roboto_italic, context);
        return sRobotoItalic;
    }
    public static Typeface robotoLight(Context context){
        sRobotoLight = getFontFromRes(R.raw.roboto_light, context);
        return sRobotoLight;
    }
    public static Typeface robotoLightItalic(Context context){
        sRobotoLightItalic = getFontFromRes(R.raw.roboto_lightitalic, context);
        return sRobotoLightItalic;
    }
    public static Typeface robotoMedium(Context context){
        sRobotoMedium = getFontFromRes(R.raw.roboto_medium, context);
        return sRobotoMedium;
    }
    public static Typeface robotoMediumItalic(Context context){
        sRobotoMediumItalic = getFontFromRes(R.raw.roboto_mediumitalic, context);
        return sRobotoMediumItalic;
    }
    public static Typeface robotoRegular(Context context){
        sRobotoRegular = getFontFromRes(R.raw.roboto_regular, context);
        return sRobotoRegular;
    }
    public static Typeface robotoThinItalic(Context context){
        sRobotoThinItalic = getFontFromRes(R.raw.roboto_thinitalic, context);
        return sRobotoThinItalic;
    }

    public static Typeface recognition(Context context){
        sRecognition = getFontFromRes(R.raw.recognition, context);
        return sRecognition;
    }

    public static Typeface androidNation(Context context){
        sAndroidNation = getFontFromRes(R.raw.androidnation, context);
        return sAndroidNation;
    }
    public static Typeface androidNationBold(Context context){
        sAndroidNationBold = getFontFromRes(R.raw.androidnation_b, context);
        return sAndroidNationBold;
    }
    public static Typeface androidNationItalic(Context context){
        sAndroidNationItalic = getFontFromRes(R.raw.androidnation_i, context);
        return sAndroidNationItalic;
    }

    public static Typeface droidSerifRegular(Context context){
        sDroidSerifRegular = getFontFromRes(R.raw.droidserif_regular, context);
        return sDroidSerifRegular;
    }
    public static Typeface droidSerifBold(Context context){
        sDroidSerifBold = getFontFromRes(R.raw.droidserif_bold, context);
        return sDroidSerifBold;
    }
    public static Typeface droidSerifBoldItalic(Context context){
        sDroidSerifBoldItalic = getFontFromRes(R.raw.droidserif_bolditalic, context);
        return sDroidSerifBoldItalic;
    }
    public static Typeface droidSerifItalic(Context context){
        sDroidSerifItalic = getFontFromRes(R.raw.droidserif_italic, context);
        return sDroidSerifItalic;
    }

    public static Typeface freedom(Context context){
        sFreedom = getFontFromRes(R.raw.freedom, context);
        return sFreedom;
    }

    public static Typeface droidRobot(Context context){
        sDroidRobot = getFontFromRes(R.raw.droid_robot_jp2, context);
        return sDroidRobot;
    }

    public static Typeface funRaiser(Context context){
        sFunRaiser = getFontFromRes(R.raw.fun_raiser, context);
        return sFunRaiser;
    }

    public static Typeface greenAvocado(Context context){
        sGreenAvocado = getFontFromRes(R.raw.green_avocado, context);
        return sGreenAvocado;
    }

    private static Typeface getFontFromRes(int resource, Context context){
        sResTypeface = null;
        sInputStream = null;
        sOutPath  = context.getCacheDir() + "/tmp" + System.currentTimeMillis() +".raw";

        try{
            sInputStream = context.getResources().openRawResource(resource);
        }catch (Resources.NotFoundException e){
            Log.e(TAG, "Could not find font in Resources!");
        }

        try{
            sBuffer = new byte[sInputStream.available()];
            sBOutStream = new BufferedOutputStream(new FileOutputStream(sOutPath));
            int l = 0;
            while ((l = sInputStream.read(sBuffer)) > 0){
                    sBOutStream.write(sBuffer, 0, l);
            }
            sBOutStream.close();

            sResTypeface = Typeface.createFromFile(sOutPath);

            new File(sOutPath).delete();
        }catch (IOException e){
            Log.e(TAG, "Error reading in fonts!");
            return null;
        }
        Log.d(TAG, "Successfully loaded font.");
        return sResTypeface;
    }
}