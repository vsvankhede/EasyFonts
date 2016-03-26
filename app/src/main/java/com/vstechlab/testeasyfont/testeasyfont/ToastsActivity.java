package com.vstechlab.testeasyfont.testeasyfont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.vstechlab.easyfonts.EasyFonts;

import java.util.ArrayList;
import java.util.List;

public class ToastsActivity extends AppCompatActivity {

    private int fontIndex;
    private TextView toastText;
    private View customToastLayout;
    private ArrayList<Pair<Typeface,String>> typefaces;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toasts);

        LayoutInflater inflater = getLayoutInflater();
        customToastLayout = inflater.inflate(R.layout.custom_toast,
                (ViewGroup) findViewById(R.id.toast_layout_root));

        toastText = (TextView) customToastLayout.findViewById(R.id.text);

        Button b = (Button) findViewById(R.id.button);

        initTypefaces();
        fontIndex = 0;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                toastText.setTypeface(typefaces.get(fontIndex).first);
                toastText.setText(typefaces.get(fontIndex).second);
                fontIndex++;

                if (fontIndex == typefaces.size()) {
                    fontIndex = 0;
                }

                Toast toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(customToastLayout);
                toast.show();

            }
        });
    }

    private void initTypefaces() {

        typefaces = new ArrayList<>();
        //get default fonts from /system/etc/
        final List<FontListParser.SystemFont> fonts = FontListParser.safelyGetSystemFonts();

        for (FontListParser.SystemFont font : fonts) {

            Pair<Typeface, String> currentFont = new Pair<> (Typeface.createFromFile(font.path),
                    font.name);
            typefaces.add(currentFont);
        }

        ArrayList<Pair<Typeface,String>> allFonts = EasyFonts.getAllFonts(this);
        typefaces.addAll(allFonts);

    }

}
