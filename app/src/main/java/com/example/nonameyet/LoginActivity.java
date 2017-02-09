package com.example.nonameyet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.example.nonameyet.R.layout.activity_login;
import static com.example.nonameyet.R.layout.activity_main;
import static com.example.nonameyet.R.layout.activity_register;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_login);
    }
}
