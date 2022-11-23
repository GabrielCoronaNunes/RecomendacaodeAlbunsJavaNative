package com.example.recomendaodelbuns;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                ActivityMain();
            }
        }, 3000);


    }

    private void ActivityMain() {
        Intent intent = new Intent(Splash.this, MainActivity.class);
        startActivity(intent);

    }



}