
/*
 * Copyright (C) 2015 EasyFonts
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vstechlab.easyfonts;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;

import com.vstechlab.testeasyfont.easyfonts.R;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Wrap Typeface object creation & developer should not
 * have to worry about adding fonts in asset folder.
 *
 * @author vijay.s.vankhede@gmail.com (Vijay Vankhede)
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

    /**
     * Roboto-Thin font face
     * @param context
     * @return
     */
    public static Typeface robotoThin(Context context){
        sRobotoThin = getFontFromRes(R.raw.roboto_thin, context);
        return sRobotoThin;
    }

    /**
     * Roboto-Black font face
     * @param context
     * @return
     */
    public static Typeface robotoBlack(Context context){
        sRobotoBlack = getFontFromRes(R.raw.roboto_black, context);
        return sRobotoBlack;
    }

    /**
     * Roboto-BlackItalic font face
     * @param context
     * @return
     */
    public static Typeface robotoBlackItalic(Context context){
        sRobotoBlackItalic = getFontFromRes(R.raw.roboto_blackitalic, context);
        return sRobotoBlackItalic;
    }

    /**
     * Roboto-Bold font face
     * @param context
     * @return
     */
    public static Typeface robotoBold(Context context){
        sRobotoBold = getFontFromRes(R.raw.roboto_bold, context);
        return sRobotoBold;
    }

    /**
     * Roboto-BoldItalic font face
     * @param context
     * @return
     */
    public static Typeface robotoBoldItalic(Context context){
        sRobotoBoldItalic = getFontFromRes(R.raw.roboto_bolditalic, context);
        return sRobotoBoldItalic;
    }

    /**
     * Roboto-Italic font face
     * @param context
     * @return Typeface
     */
    public static Typeface robotoItalic(Context context){
        sRobotoItalic = getFontFromRes(R.raw.roboto_italic, context);
        return sRobotoItalic;
    }

    /**
     * Roboto-Light font face
     * @param context
     * @return Typeface
     */
    public static Typeface robotoLight(Context context){
        sRobotoLight = getFontFromRes(R.raw.roboto_light, context);
        return sRobotoLight;
    }

    /**
     * Roboto-LightItalic
     * @param context
     * @return Typeface
     */
    public static Typeface robotoLightItalic(Context context){
        sRobotoLightItalic = getFontFromRes(R.raw.roboto_lightitalic, context);
        return sRobotoLightItalic;
    }

    /**
     * Roboto-Medium font face
     * @param context
     * @return Typeface
     */
    public static Typeface robotoMedium(Context context){
        sRobotoMedium = getFontFromRes(R.raw.roboto_medium, context);
        return sRobotoMedium;
    }

    /**
     * Roboto-MediumItalic font face
     * @param context
     * @return Typeface
     */
    public static Typeface robotoMediumItalic(Context context){
        sRobotoMediumItalic = getFontFromRes(R.raw.roboto_mediumitalic, context);
        return sRobotoMediumItalic;
    }

    /**
     * Roboto-Regular font face
     * @param context
     * @return
     */
    public static Typeface robotoRegular(Context context){
        sRobotoRegular = getFontFromRes(R.raw.roboto_regular, context);
        return sRobotoRegular;
    }

    /**
     * Roboto-ThinItalic font face
     * @param context
     * @return
     */
    public static Typeface robotoThinItalic(Context context){
        sRobotoThinItalic = getFontFromRes(R.raw.roboto_thinitalic, context);
        return sRobotoThinItalic;
    }

    /**
     * Recognition font face
     * @param context
     * @return Typeface
     */
    public static Typeface recognition(Context context){
        sRecognition = getFontFromRes(R.raw.recognition, context);
        return sRecognition;
    }

    /**
     * Android Nation font face
     * @param context
     * @return Typeface
     */
    public static Typeface androidNation(Context context){
        sAndroidNation = getFontFromRes(R.raw.androidnation, context);
        return sAndroidNation;
    }

    /**
     * Android Nation-Bold font face
     * @param context
     * @return Typeface
     */
    public static Typeface androidNationBold(Context context){
        sAndroidNationBold = getFontFromRes(R.raw.androidnation_b, context);
        return sAndroidNationBold;
    }

    /**
     * Android Nation-Italic font face
     * @param context
     * @return Typeface
     */
    public static Typeface androidNationItalic(Context context){
        sAndroidNationItalic = getFontFromRes(R.raw.androidnation_i, context);
        return sAndroidNationItalic;
    }

    /**
     * Droid Serif-Regular font face
     * @param context
     * @return Typeface
     */
    public static Typeface droidSerifRegular(Context context){
        sDroidSerifRegular = getFontFromRes(R.raw.droidserif_regular, context);
        return sDroidSerifRegular;
    }

    /**
     * Droid Serif-Bold font face
     * @param context
     * @return Typeface
     */
    public static Typeface droidSerifBold(Context context){
        sDroidSerifBold = getFontFromRes(R.raw.droidserif_bold, context);
        return sDroidSerifBold;
    }

    /**
     * Droid Serif-Italic font face
     * @param context
     * @return Typeface
     */
    public static Typeface droidSerifBoldItalic(Context context){
        sDroidSerifBoldItalic = getFontFromRes(R.raw.droidserif_bolditalic, context);
        return sDroidSerifBoldItalic;
    }

    /**
     * Droid Serif-Italic font face
     * @param context
     * @return Typeface
     */
    public static Typeface droidSerifItalic(Context context){
        sDroidSerifItalic = getFontFromRes(R.raw.droidserif_italic, context);
        return sDroidSerifItalic;
    }

    /**
     * Freedom font face
     * @param context
     * @return Typeface
     */
    public static Typeface freedom(Context context){
        sFreedom = getFontFromRes(R.raw.freedom, context);
        return sFreedom;
    }

    /**
     * Droid Robot font face
     * @param context
     * @return Typeface
     */
    public static Typeface droidRobot(Context context){
        sDroidRobot = getFontFromRes(R.raw.droid_robot_jp2, context);
        return sDroidRobot;
    }

    /**
     * Fun Raiser font face
     * @param context
     * @return Typeface
     */
    public static Typeface funRaiser(Context context){
        sFunRaiser = getFontFromRes(R.raw.fun_raiser, context);
        return sFunRaiser;
    }

    /**
     * Green Avocado font face
     * @param context
     * @return Typeface
     */
    public static Typeface greenAvocado(Context context){
        sGreenAvocado = getFontFromRes(R.raw.green_avocado, context);
        return sGreenAvocado;
    }

    /**
     * Parse fonts from assets to temp dir
     * @param resource
     * @param context
     * @return
     */
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
