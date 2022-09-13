package com.room.servicedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.room.servicedemo.service.MyStartedService;

public class MainActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intent = new Intent(MainActivity.this, MyStartedService.class);

    }

    public void stopStartedService(View view) {
        stopService(intent);

    }

    public void startStartedService(View view) {
        startService(intent);
    }
}