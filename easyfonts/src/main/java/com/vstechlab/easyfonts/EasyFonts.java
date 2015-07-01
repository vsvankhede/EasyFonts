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
import android.graphics.Typeface;

import com.vstechlab.testeasyfont.easyfonts.R;

/**
 * Wraps Typeface object creation.
 * Developer should not have to worry about adding fonts in asset folder.
 *
 * @author vijay.s.vankhede@gmail.com (Vijay Vankhede)
 */
public final class EasyFonts {

    private EasyFonts(){}

    /**
     * Roboto-Thin font face
     * @param context context
     * @return Typeface object for Roboto Thin
     */
    public static Typeface robotoThin(Context context){
        return FontSourceProcessor.process(R.raw.roboto_thin, context);
    }

    /**
     * Roboto-Black font face
     * @param context context
     * @return Typeface object for Roboto Black
     */
    public static Typeface robotoBlack(Context context){
        return FontSourceProcessor.process(R.raw.roboto_black, context);
    }

    /**
     * Roboto-BlackItalic font face
     * @param context context
     * @return Typeface object for Roboto Black-Italic
     */
    public static Typeface robotoBlackItalic(Context context){
        return FontSourceProcessor.process(R.raw.roboto_blackitalic, context);
    }

    /**
     * Roboto-Bold font face
     * @param context context
     * @return Typeface object for Roboto Bold
     */
    public static Typeface robotoBold(Context context){
        return FontSourceProcessor.process(R.raw.roboto_bold, context);
    }

    /**
     * Roboto-BoldItalic font face
     * @param context context
     * @return Typeface object for Roboto Bold-Italic
     */
    public static Typeface robotoBoldItalic(Context context){
        return FontSourceProcessor.process(R.raw.roboto_bolditalic, context);
    }

    /**
     * Roboto-Italic font face
     * @param context context
     * @return Typeface object for Roboto Italic
     */
    public static Typeface robotoItalic(Context context){
        return FontSourceProcessor.process(R.raw.roboto_italic, context);
    }

    /**
     * Roboto-Light font face
     * @param context Context
     * @return Typeface object for Roboto Light
     */
    public static Typeface robotoLight(Context context){
        return FontSourceProcessor.process(R.raw.roboto_light, context);
    }

    /**
     * Roboto-LightItalic
     * @param context Context
     * @return Typeface object for Roboto Light-Italic
     */
    public static Typeface robotoLightItalic(Context context){
        return FontSourceProcessor.process(R.raw.roboto_lightitalic, context);
    }

    /**
     * Roboto-Medium font face
     * @param context Context
     * @return Typeface object for Roboto Medium
     */
    public static Typeface robotoMedium(Context context){
//        sRobotoMedium = getFontFromRes(R.raw.roboto_medium, context);
        return FontSourceProcessor.process(R.raw.roboto_medium, context);
    }

    /**
     * Roboto-MediumItalic font face
     * @param context Context
     * @return Typeface object for Roboto Medium-Italic
     */
    public static Typeface robotoMediumItalic(Context context){
        return FontSourceProcessor.process(R.raw.roboto_mediumitalic, context);
    }

    /**
     * Roboto-Regular font face
     * @param context Context
     * @return Typeface object for Roboto Regular
     */
    public static Typeface robotoRegular(Context context){
        return FontSourceProcessor.process(R.raw.roboto_regular, context);
    }

    /**
     * Roboto-ThinItalic font face
     * @param context Context
     * @return Typeface object for Roboto Thin-Italic
     */
    public static Typeface robotoThinItalic(Context context){
        return FontSourceProcessor.process(R.raw.roboto_thinitalic, context);
    }

    /**
     * Recognition font face
     * @param context Context
     * @return Typeface object for Recognition
     */
    public static Typeface recognition(Context context){
        return FontSourceProcessor.process(R.raw.recognition, context);
    }

    /**
     * Android Nation font face
     * @param context Context
     * @return Typeface object for Android Nation
     */
    public static Typeface androidNation(Context context){
        return FontSourceProcessor.process(R.raw.androidnation, context);
    }

    /**
     * Android Nation-Bold font face
     * @param context Context
     * @return Typeface object for Android Nation-Bold
     */
    public static Typeface androidNationBold(Context context){
        return FontSourceProcessor.process(R.raw.androidnation_b, context);
    }

    /**
     * Android Nation-Italic font face
     * @param context Context
     * @return Typeface object for Android Nation-Italic
     */
    public static Typeface androidNationItalic(Context context){
        return FontSourceProcessor.process(R.raw.androidnation_i, context);
    }

    /**
     * Droid Serif-Regular font face
     * @param context Context
     * @return Typeface object for Droid Serif-Regular
     */
    public static Typeface droidSerifRegular(Context context){
        return FontSourceProcessor.process(R.raw.droidserif_regular, context);
    }

    /**
     * Droid Serif-Bold font face
     * @param context Context
     * @return Typeface object for Droid Serif-Bold
     */
    public static Typeface droidSerifBold(Context context){
        return FontSourceProcessor.process(R.raw.droidserif_bold, context);
    }

    /**
     * Droid Serif Bold-Italic font face
     * @param context Context
     * @return Typeface object for Droid Serif Bold-Italic
     */
    public static Typeface droidSerifBoldItalic(Context context){
        return FontSourceProcessor.process(R.raw.droidserif_bolditalic, context);
    }

    /**
     * Droid Serif-Italic font face
     * @param context Context
     * @return Typeface object for Droid Serif-Italic
     */
    public static Typeface droidSerifItalic(Context context){
        return FontSourceProcessor.process(R.raw.droidserif_italic, context);
    }

    /**
     * Freedom font face
     * @param context Context
     * @return TypefaceTypeface object for Freedom
     */
    public static Typeface freedom(Context context){
        return FontSourceProcessor.process(R.raw.freedom, context);
    }

    /**
     * Droid Robot font face
     * @param context Context
     * @return Typeface object for Droid Robot
     */
    public static Typeface droidRobot(Context context){
        return FontSourceProcessor.process(R.raw.droid_robot_jp2, context);
    }

    /**
     * Fun Raiser font face
     * @param context Context
     * @return Typeface object for Fun Raiser
     */
    public static Typeface funRaiser(Context context){
        return FontSourceProcessor.process(R.raw.fun_raiser, context);
    }

    /**
     * Green Avocado font face
     * @param context Context
     * @return Typeface object for Green Avocado
     */
    public static Typeface greenAvocado(Context context){
        return FontSourceProcessor.process(R.raw.green_avocado, context);
    }

    /**
     * Walkway-Black font face
     * @param context Context
     * @return Typeface object for Walkway-Black
     */
    public static Typeface walkwayBlack(Context context){
        return FontSourceProcessor.process(R.raw.walkway_black, context);
    }

    /**
     * Walkway-Bold font face
     * @param context Context
     * @return Typeface object for Walkway-Bold
     */
    public static Typeface walkwayBold(Context context){
        return FontSourceProcessor.process(R.raw.walkway_bold, context);
    }

    /**
     * Walkway-Oblique font face
     * @param context Context
     * @return Typeface object for Walkway-Oblique
     */
    public static Typeface walkwayOblique(Context context){
        return FontSourceProcessor.process(R.raw.walkway_oblique, context);
    }

    /**
     * Walkway-ObliqueBlack font face
     * @param context Context
     * @return Typeface object for Walkway-ObliqueBlack
     */
    public static Typeface walkwayObliqueBlack(Context context){
        return FontSourceProcessor.process(R.raw.walkway_oblique_black, context);
    }

    /**
     * Walkway-ObliqueSemiBold font face
     * @param context Context
     * @return Typeface object for Walkway-ObliqueSemiBold
     */
    public static Typeface walkwayObliqueSemiBold(Context context){
        return FontSourceProcessor.process(R.raw.walkway_oblique_semibold, context);
    }

    /**
     * Walkway-Oblique-UltraBold font face
     * @param context Context
     * @return Typeface object for Walkway-Oblique-UltraBold
     */
    public static Typeface walkwayObliqueUltraBold(Context context){
        return FontSourceProcessor.process(R.raw.walkway_oblique_ultrabold, context);
    }

    /**
     * Walkway-SemiBold font face
     * @param context Context
     * @return Typeface object for Walkway-SemiBold
     */
    public static Typeface walkwaySemiBold(Context context){
        return FontSourceProcessor.process(R.raw.walkway_semibold, context);
    }

    /**
     * Walkway-UltraBold font face
     * @param context Context
     * @return Typeface object for Walkway-UltraBold
     */
    public static Typeface walkwayUltraBold(Context context){
        return FontSourceProcessor.process(R.raw.walkway_ultrabold, context);
    }

    /**
     * Windsong font face
     * @param context Context
     * @return Typeface object for Windsong
     */
    public static Typeface windSong(Context context){
        return FontSourceProcessor.process(R.raw.windsong, context);
    }

    /**
     * Tangerine-Regular font face
     * @param context Context
     * @return Typeface object for Tangerine-Regular
     */
    public static Typeface tangerineRegular(Context context){
        return FontSourceProcessor.process(R.raw.tangerine_regular, context);
    }

    /**
     * Tangerine-Bold font face
     * @param context Context
     * @return Typeface object for Tangerine-Bold
     */
    public static Typeface tangerineBold(Context context){
        return FontSourceProcessor.process(R.raw.tangerine_bold, context);
    }

    /**
     * Ostrich-Black font face
     * @param context Context
     * @return Typeface object for Ostrich-Black
     */
    public static Typeface ostrichBlack(Context context){
        return FontSourceProcessor.process(R.raw.ostrich_black, context);
    }

    /**
     * Ostrich-Bold font face
     * @param context Context
     * @return Typeface object for Ostrich-Bold
     */
    public static Typeface ostrichBold(Context context){
        return FontSourceProcessor.process(R.raw.ostrich_bold, context);
    }

    /**
     * Ostrich-Dashed font face
     * @param context Context
     * @return Typeface object for Ostrich-Dashed
     */
    public static Typeface ostrichDashed(Context context){
        return FontSourceProcessor.process(R.raw.ostrich_dashed, context);
    }

    /**
     * Ostrich-Light font face
     * @param context Context
     * @return Typeface object for Ostrich-Light
     */
    public static Typeface ostrichLight(Context context){
        return FontSourceProcessor.process(R.raw.ostrich_light, context);
    }

    /**
     * Ostrich-Regular font face
     * @param context Context
     * @return Typeface object for Ostrich-Regular
     */
    public static Typeface ostrichRegular(Context context){
        return FontSourceProcessor.process(R.raw.ostrich_regular, context);
    }

    /**
     * Ostrich-Rounded font face
     * @param context Context
     * @return Typeface object for Ostrich-Rounded
     */
    public static Typeface ostrichRounded(Context context){
        return FontSourceProcessor.process(R.raw.ostrich_rounded, context);
    }

    /**
     * CaviarDreams-Bold font face
     * @param context Context
     * @return Typeface object for CaviarDreams-Bold
     */
    public static Typeface caviarDreamsBold(Context context){
        return FontSourceProcessor.process(R.raw.caviar_dreams_bold, context);
    }

    /**
     * CaviarDreams font face
     * @param context Context
     * @return Typeface object for CaviarDreams
     */
    public static Typeface caviarDreams(Context context){
        return FontSourceProcessor.process(R.raw.caviardreams, context);
    }

    /**
     * CaviarDreams-BoldItalic font face
     * @param context Context
     * @return Typeface object for CaviarDreams-BoldItalic
     */
    public static Typeface caviarDreamsBoldItalic(Context context){
        return FontSourceProcessor.process(R.raw.caviardreams_bolditalic, context);
    }

    /**
     * CaviarDreams-Italic font face
     * @param context Context
     * @return Typeface object for CaviarDreams-Italic
     */
    public static Typeface caviarDreamsItalic(Context context){
        return FontSourceProcessor.process(R.raw.caviardreams_italic, context);
    }

    /**
     * Capture-It font face
     * @param context Context
     * @return Typeface object for Capture-It
     */
    public static Typeface captureIt(Context context){
        return FontSourceProcessor.process(R.raw.capture_it, context);
    }

    /**
     * Capture-It font face
     * @param context Context
     * @return Typeface object for Capture-It2
     */
    public static Typeface captureIt2(Context context){
        return FontSourceProcessor.process(R.raw.capture_it_2, context);
    }

    /**
     * CAC-Champagne font face
     * @param context Context
     * @return Typeface object for CAC-Champagne
     */
    public static Typeface cac_champagne(Context context){
        return FontSourceProcessor.process(R.raw.cac_champagne, context);
    }
}