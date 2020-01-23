package com.example.reuniozinha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.reuniozinha.ui.activities.LoginActivity;

public class SplashActitvity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarLogin();
            }
        }, 2000);

    }

    public void mostrarLogin() {
        Intent intent = new Intent(
                SplashActitvity.this,
                LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
