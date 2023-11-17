package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;


public class Activitylogorreg extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylogorreg);

        Button registrationb = findViewById(R.id.registrationb);
        Button loginb = findViewById(R.id.loginb);

        registrationb.setOnClickListener(v -> {
            Intent loginIntent = new Intent(Activitylogorreg.this, RegisterActivity.class);
            startActivity(loginIntent);
        });
        loginb.setOnClickListener(v -> {
            Intent loginIntent = new Intent(Activitylogorreg.this, LoginActivity.class);
            startActivity(loginIntent);
        });
    }
}