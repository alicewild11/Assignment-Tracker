package com.example.assignmenttracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide(); //hide the action bar so the sp;ash screen is full screen

        final Intent a = new Intent(SplashActivity.this, MainActivity.class);
        //launch main activity from the splash activity screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(a);
                finish();
            }
        }, 2000);

    }

}