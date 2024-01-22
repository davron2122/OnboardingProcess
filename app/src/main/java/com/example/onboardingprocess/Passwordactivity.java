package com.example.onboardingprocess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;



public class Passwordactivity extends AppCompatActivity {

    private TextView Resetbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        Resetbtn=findViewById(R.id.resetinsctruction);

        Resetbtn.setOnClickListener(new View.OnClickListener() {
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
