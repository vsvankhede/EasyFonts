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

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.InputStream;

/**
 * Font Source processor for file to asset
 * 
 * @author vijay.s.vankhede@gmail.com (Vijay Vankhede)
 */
final class FontSourceProcessor {
    private static final String TAG = "FontSourceProcessor";

    public static Typeface process(int resource, Context context){
        Typeface sResTypeface;
        InputStream sInputStream = null;

        String sOutPath = context.getCacheDir() + "/tmp" + System.currentTimeMillis() + ".raw";

        try{
            sInputStream = context.getResources().openRawResource(resource);
        }catch (Resources.NotFoundException e){
            Log.e(TAG, "Could not find font in Resources!");
        }

        try{
            byte[] sBuffer = new byte[sInputStream.available()];
            BufferedOutputStream sBOutStream = new BufferedOutputStream(new FileOutputStream(sOutPath));
            int l;
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
