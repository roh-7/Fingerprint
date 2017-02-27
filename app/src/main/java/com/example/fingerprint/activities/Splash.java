package com.example.fingerprint.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

import com.example.fingerprint.R;

public class Splash extends AppCompatActivity {

    private final int SPLASH_TIME_OUT = 2000; // in milliseconds;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                final Intent intent = new Intent(Splash.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);
    }
}
