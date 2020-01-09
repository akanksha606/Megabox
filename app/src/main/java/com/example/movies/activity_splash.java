package com.example.movies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

public class activity_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        ImageView logoLayout = findViewById(R.id.logo);
        logoLayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2000);
        logoLayout.animate().alpha(1.0f).scaleX(1.1f).scaleY(1.1f).setDuration(2500);
        {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    Intent i = new Intent(getApplicationContext(),activity_home.class);
                    startActivity(i);
                    finish();
                    finishActivity(0);
                }
            }, 2600);

    }
}}
