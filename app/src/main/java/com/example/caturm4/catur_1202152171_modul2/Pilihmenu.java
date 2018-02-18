package com.example.caturm4.catur_1202152171_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Pilihmenu extends AppCompatActivity {
    RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilihmenu);
        rg = findViewById(R.id.radiogroup);
    }

    public void masukindata(View view) {
        int id = rg.getCheckedRadioButtonId();
        RadioButton rb = findViewById(id);
        String pilihan = rb.getText().toString();
        switch (pilihan){
            case "Dine In":
                startActivity(new Intent(Pilihmenu.this, Dinein.class));
                Toast.makeText(Pilihmenu.this, "Memilih Dine In", Toast.LENGTH_SHORT).show();
                break;
            case "Take Away":
                startActivity(new Intent(Pilihmenu.this, Takeaway.class));
                Toast.makeText(Pilihmenu.this, "Memilih Take Away", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
