package com.vstechlab.testeasyfont.testeasyfont;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

public class MainActivity extends AppCompatActivity {
    // Roboto
    TextView tv_roboto_black;
    TextView tv_roboto_black_italic;
    TextView tv_roboto_bold;
    TextView tv_roboto_bold_italic;
    TextView tv_roboto_italic;
    TextView tv_roboto_light;
    TextView tv_roboto_light_italic;
    TextView tv_roboto_medium;
    TextView tv_roboto_medium_italic;
    TextView tv_roboto_regular;
    TextView tv_roboto_thin;
    TextView tv_roboto_thin_italic;
    // Android Nation
    TextView tv_android_nation;
    TextView tv_android_nation_bold;
    TextView tv_android_nation_italic;
    // Droid Robot
    TextView tv_droid_robot;
    // Droid Serif
    TextView tv_droid_serif_bold;
    TextView tv_droid_serif_bold_italic;
    TextView tv_droid_serif_italic;
    TextView tv_droid_serif_regular;

    TextView tv_freedom;

    TextView tv_fun_raiser;

    TextView tv_green_avocado;

    TextView tv_recognition;

    // Walkway
    TextView tv_walkway_black;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button toastButton = (Button) findViewById(R.id.toast_button);
        toastButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toastIntent = new Intent(MainActivity.this, ToastsActivity.class);
                startActivity(toastIntent);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        tv_roboto_black = (TextView) findViewById(R.id.tv_roboto_black);
        tv_roboto_black_italic = (TextView) findViewById(R.id.tv_roboto_black_italic);
        tv_roboto_bold = (TextView) findViewById(R.id.tv_roboto_bold);
        tv_roboto_bold_italic = (TextView) findViewById(R.id.tv_roboto_bold_italic);
        tv_roboto_italic = (TextView) findViewById(R.id.tv_roboto_italic);
        tv_roboto_light = (TextView) findViewById(R.id.tv_roboto_light);
        tv_roboto_light_italic = (TextView) findViewById(R.id.tv_roboto_light_italic);
        tv_roboto_medium = (TextView) findViewById(R.id.tv_roboto_medium);
        tv_roboto_medium_italic = (TextView) findViewById(R.id.tv_roboto_medium_italic);
        tv_roboto_regular = (TextView) findViewById(R.id.tv_roboto_regular);
        tv_roboto_thin = (TextView) findViewById(R.id.tv_roboto_thin);
        tv_roboto_thin_italic = (TextView) findViewById(R.id.tv_roboto_thin_italic);

        tv_android_nation = (TextView) findViewById(R.id.tv_android_nation);
        tv_android_nation_bold = (TextView) findViewById(R.id.tv_android_nation_bold);
        tv_android_nation_italic = (TextView) findViewById(R.id.tv_android_nation_italic);

        tv_droid_robot = (TextView) findViewById(R.id.tv_droid_robot);

        tv_droid_serif_bold = (TextView) findViewById(R.id.tv_droid_serif_bold);
        tv_droid_serif_bold_italic = (TextView) findViewById(R.id.tv_droid_serif_bold_italic);
        tv_droid_serif_italic = (TextView) findViewById(R.id.tv_droid_serif_italic);
        tv_droid_serif_regular = (TextView) findViewById(R.id.tv_droid_serif_regular);

        tv_freedom = (TextView) findViewById(R.id.tv_freedom);
        tv_fun_raiser = (TextView) findViewById(R.id.tv_fun_raiser);
        tv_green_avocado = (TextView) findViewById(R.id.tv_green_avocado);
        tv_recognition = (TextView) findViewById(R.id.tv_recognition);

        tv_walkway_black = (TextView) findViewById(R.id.tv_walkway_black);

        // Set typeface
        tv_roboto_black.setTypeface(EasyFonts.robotoBlack(this));
        tv_roboto_black_italic.setTypeface(EasyFonts.robotoBlackItalic(this));
        tv_roboto_bold.setTypeface(EasyFonts.robotoBold(this));
        tv_roboto_bold_italic.setTypeface(EasyFonts.robotoBoldItalic(this));
        tv_roboto_italic.setTypeface(EasyFonts.robotoItalic(this));
        tv_roboto_light.setTypeface(EasyFonts.robotoLight(this));
        tv_roboto_light_italic.setTypeface(EasyFonts.robotoLightItalic(this));
        tv_roboto_medium.setTypeface(EasyFonts.robotoMedium(this));
        tv_roboto_medium_italic.setTypeface(EasyFonts.robotoMediumItalic(this));
        tv_roboto_regular.setTypeface(EasyFonts.robotoRegular(this));
        tv_roboto_thin.setTypeface(EasyFonts.robotoThin(this));
        tv_roboto_thin_italic.setTypeface(EasyFonts.robotoThinItalic(this));

        tv_android_nation.setTypeface(EasyFonts.androidNation(this));
        tv_android_nation_bold.setTypeface(EasyFonts.androidNationBold(this));
        tv_android_nation_italic.setTypeface(EasyFonts.androidNationItalic(this));

        tv_droid_robot.setTypeface(EasyFonts.droidRobot(this));

        tv_droid_serif_bold.setTypeface(EasyFonts.droidSerifBold(this));
        tv_droid_serif_bold_italic.setTypeface(EasyFonts.droidSerifBoldItalic(this));
        tv_droid_serif_italic.setTypeface(EasyFonts.droidSerifItalic(this));
        tv_droid_serif_regular.setTypeface(EasyFonts.droidSerifRegular(this));

        tv_freedom.setTypeface(EasyFonts.freedom(this));
        tv_fun_raiser.setTypeface(EasyFonts.funRaiser(this));
        tv_green_avocado.setTypeface(EasyFonts.greenAvocado(this));
        tv_recognition.setTypeface(EasyFonts.recognition(this));

        tv_walkway_black.setTypeface(EasyFonts.walkwayBlack(this));

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
