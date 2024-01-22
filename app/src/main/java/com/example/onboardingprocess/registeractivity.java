package com.example.onboardingprocess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class registeractivity extends AppCompatActivity {

    private TextView Loginbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registeractivity);
        Loginbtn=findViewById(R.id.loginid);

        Loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(), verifyactivity.class);
                startActivity(intent);
            }
        });


    }



    public void backbuttonClicked(View view){
        finish();

    }



}
