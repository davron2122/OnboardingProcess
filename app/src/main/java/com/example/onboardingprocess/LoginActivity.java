package com.example.onboardingprocess;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class LoginActivity extends AppCompatActivity {

    private TextView registerBtn;
    private TextView Enterpassworbtn;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



        registerBtn = findViewById(R.id.bottomrighttext);
         Enterpassworbtn = findViewById(R.id.enterpassword);

        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent=new Intent(getBaseContext(),registeractivity.class);
               startActivity(intent);
            }
        });
        Enterpassworbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), Passwordactivity.class);
                startActivity(intent);
            }
        });


    }
    public void backbuttonClicked(View view){
        finish();

    }







}

