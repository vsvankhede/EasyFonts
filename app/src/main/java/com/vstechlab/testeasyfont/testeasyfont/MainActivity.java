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
    TextView tvRobotoBlack;
    TextView tvRobotoBlackItalic;
    TextView tvRobotoBold;
    TextView tvRobotoBoldItalic;
    TextView tvRobotoItalic;
    TextView tvRobotoLight;
    TextView tvRobotoLightItalic;
    TextView tvRobotoMedium;
    TextView tvRobotoMediumItalic;
    TextView tvRobotoRegular;
    TextView tvRobotoThin;
    TextView tvRobotoThinItalic;
    // Android Nation
    TextView tvAndroidNation;
    TextView tvAndroidNationBold;
    TextView tvAndroidNationItalic;
    // Droid Robot
    TextView tvDroidRobot;
    // Droid Serif
    TextView tvDroidSerifBold;
    TextView tvDroidSerifBoldItalic;
    TextView tvDroidSerifItalic;
    TextView tvDroidSerifRegular;

    TextView tvFreedom;

    TextView tvFunRaiser;

    TextView tvGreenAvocado;

    TextView tvRecognition;

    // Walkway
    TextView tvWalkwayBlack;

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

        tvRobotoBlack = (TextView) findViewById(R.id.tv_roboto_black);
        tvRobotoBlackItalic = (TextView) findViewById(R.id.tv_roboto_black_italic);
        tvRobotoBold = (TextView) findViewById(R.id.tv_roboto_bold);
        tvRobotoBoldItalic = (TextView) findViewById(R.id.tv_roboto_bold_italic);
        tvRobotoItalic = (TextView) findViewById(R.id.tv_roboto_italic);
        tvRobotoLight = (TextView) findViewById(R.id.tv_roboto_light);
        tvRobotoLightItalic = (TextView) findViewById(R.id.tv_roboto_light_italic);
        tvRobotoMedium = (TextView) findViewById(R.id.tv_roboto_medium);
        tvRobotoMediumItalic = (TextView) findViewById(R.id.tv_roboto_medium_italic);
        tvRobotoRegular = (TextView) findViewById(R.id.tv_roboto_regular);
        tvRobotoThin = (TextView) findViewById(R.id.tv_roboto_thin);
        tvRobotoThinItalic = (TextView) findViewById(R.id.tv_roboto_thin_italic);

        tvAndroidNation = (TextView) findViewById(R.id.tv_android_nation);
        tvAndroidNationBold = (TextView) findViewById(R.id.tv_android_nation_bold);
        tvAndroidNationItalic = (TextView) findViewById(R.id.tv_android_nation_italic);

        tvDroidRobot = (TextView) findViewById(R.id.tv_droid_robot);

        tvDroidSerifBold = (TextView) findViewById(R.id.tv_droid_serif_bold);
        tvDroidSerifBoldItalic = (TextView) findViewById(R.id.tv_droid_serif_bold_italic);
        tvDroidSerifItalic = (TextView) findViewById(R.id.tv_droid_serif_italic);
        tvDroidSerifRegular = (TextView) findViewById(R.id.tv_droid_serif_regular);

        tvFreedom = (TextView) findViewById(R.id.tv_freedom);
        tvFunRaiser = (TextView) findViewById(R.id.tv_fun_raiser);
        tvGreenAvocado = (TextView) findViewById(R.id.tv_green_avocado);
        tvRecognition = (TextView) findViewById(R.id.tv_recognition);

        tvWalkwayBlack = (TextView) findViewById(R.id.tv_walkway_black);

        // Set typeface
        tvRobotoBlack.setTypeface(EasyFonts.robotoBlack(this));
        tvRobotoBlackItalic.setTypeface(EasyFonts.robotoBlackItalic(this));
        tvRobotoBold.setTypeface(EasyFonts.robotoBold(this));
        tvRobotoBoldItalic.setTypeface(EasyFonts.robotoBoldItalic(this));
        tvRobotoItalic.setTypeface(EasyFonts.robotoItalic(this));
        tvRobotoLight.setTypeface(EasyFonts.robotoLight(this));
        tvRobotoLightItalic.setTypeface(EasyFonts.robotoLightItalic(this));
        tvRobotoMedium.setTypeface(EasyFonts.robotoMedium(this));
        tvRobotoMediumItalic.setTypeface(EasyFonts.robotoMediumItalic(this));
        tvRobotoRegular.setTypeface(EasyFonts.robotoRegular(this));
        tvRobotoThin.setTypeface(EasyFonts.robotoThin(this));
        tvRobotoThinItalic.setTypeface(EasyFonts.robotoThinItalic(this));

        tvAndroidNation.setTypeface(EasyFonts.androidNation(this));
        tvAndroidNationBold.setTypeface(EasyFonts.androidNationBold(this));
        tvAndroidNationItalic.setTypeface(EasyFonts.androidNationItalic(this));

        tvDroidRobot.setTypeface(EasyFonts.droidRobot(this));

        tvDroidSerifBold.setTypeface(EasyFonts.droidSerifBold(this));
        tvDroidSerifBoldItalic.setTypeface(EasyFonts.droidSerifBoldItalic(this));
        tvDroidSerifItalic.setTypeface(EasyFonts.droidSerifItalic(this));
        tvDroidSerifRegular.setTypeface(EasyFonts.droidSerifRegular(this));

        tvFreedom.setTypeface(EasyFonts.freedom(this));
        tvFunRaiser.setTypeface(EasyFonts.funRaiser(this));
        tvGreenAvocado.setTypeface(EasyFonts.greenAvocado(this));
        tvRecognition.setTypeface(EasyFonts.recognition(this));

        tvWalkwayBlack.setTypeface(EasyFonts.walkwayBlack(this));

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
