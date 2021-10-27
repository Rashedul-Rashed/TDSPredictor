package com.example.tdspredictor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class DeveloperInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer_info);
        getSupportActionBar().setTitle("Developers Info");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}