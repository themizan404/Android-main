package com.cesurazure.evidence;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Intent i=getIntent();

        TextView txtWelcome=findViewById(R.id.txtWelcome);
        String user=i.getStringExtra("username");
        txtWelcome.setText("Welcome " +user);
    }
}