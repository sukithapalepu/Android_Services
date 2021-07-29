package com.example.android_services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   private static final String TAG = MainActivity.class.getSimpleName();

    Button buttonStart, buttonStop, buttonNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonStart = findViewById(R.id.buttonStart);
        buttonStop = findViewById(R.id.buttonStop);
        buttonNext = findViewById(R.id.buttonNext);

        buttonStart.setOnClickListener(this);
        buttonStop.setOnClickListener(this);
        buttonNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.buttonStart:
                Log.d(TAG,"buttonstart() caled");
                startService(new Intent(this, MyService.class));
                break;

            case R.id.buttonStop:
                stopService(new Intent(this, MyService.class));
                break;

            case R.id.buttonNext:
                Intent intent = new Intent(this, NextPage.class);
                startActivity(intent);
                break;

        }

    }
}

