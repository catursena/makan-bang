package com.example.caturm4.catur_1202152171_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;



public class Dinein extends AppCompatActivity {
    Spinner meja;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dinein);
        setTitle("Dine In");
        meja = findViewById(R.id.nomor_meja);
    }

    public void lihatinmenu2(View view) {
        Toast.makeText(Dinein.this, meja.getSelectedItem().toString()+" dipilih", Toast.LENGTH_SHORT).show();
        startActivity(new Intent(Dinein.this, Menu.class));
        finish();
    }
}