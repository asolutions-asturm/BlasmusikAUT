package com.asolutions.android.blasmusikaut;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;

import androidx.appcompat.app.AppCompatActivity;

    public class SplashScreen extends AppCompatActivity
    {
        private static int SPLASHSCREEN = 6000;

        Handler handler;
        Window window;
        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splashscreen);

            if(Build.VERSION.SDK_INT >= 21)
            {
                window = this.getWindow();
                window.setStatusBarColor(this.getResources().getColor(R.color.colorBasicWhite));
            }

            handler = new Handler();
            handler.postDelayed(new Runnable()
            {
                @Override
                public void run()
                {
                    Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                    finish(); //Closes when 'Back'
                }
            }, SPLASHSCREEN);
        }
    }

