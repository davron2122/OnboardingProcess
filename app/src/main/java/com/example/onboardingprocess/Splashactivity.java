package com.example.onboardingprocess;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Splashactivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       Handler handler = new Handler();
       handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               //Launch login Page
               Intent intent=new Intent(getBaseContext(), LoginActivity.class);startActivity(intent);

           }
       },3000);
    }
}
