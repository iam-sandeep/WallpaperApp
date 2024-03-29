package com.pinesoftware.wallpaperapp;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;

public class SplashActivity extends AppCompatActivity {



    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent  intent = new Intent(SplashActivity.this, NavigationActivity.class);
             startActivity(intent);
             finish();
         }
     },SPLASH_DISPLAY_LENGTH);


    }
}
