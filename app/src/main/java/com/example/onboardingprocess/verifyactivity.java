package com.example.onboardingprocess;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class verifyactivity extends AppCompatActivity {

    private TextView Newpassword;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);

        Newpassword=findViewById(R.id.verfyaccountbtn);
        Newpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getBaseContext(),activity_newpassword.class);
                startActivity(intent);
            }
        });



    }
    public void backbuttonClicked(View view){
        finish();

    }

}
