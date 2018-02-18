package com.example.caturm4.catur_1202152171_modul2;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(splash.this, Pilihmenu.class));
                Toast.makeText(splash.this, "CATUR SENA NUGRAHA_1202152171", Toast.LENGTH_SHORT).show();
                finish();
            }
        }, 2000);
    }
}