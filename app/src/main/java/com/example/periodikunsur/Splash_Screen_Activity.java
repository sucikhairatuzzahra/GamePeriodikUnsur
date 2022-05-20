package com.example.periodikunsur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash_Screen_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread timer = new Thread(){
            public void run (){
                try {
                    sleep(3000);
                }catch (Exception error) {
                    error.printStackTrace();
                }finally {
                    Intent intenMain = new Intent(Splash_Screen_Activity.this, MainActivity.class);
                    startActivity(intenMain);
                    finish();
                }
            }
        };
        timer.start();
    }
}