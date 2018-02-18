package com.example.caturm4.catur_1202152171_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.caturm4.catur_1202152171_modul2.R;

public class Takeaway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_takeaway);
        setTitle("Take Away");
    }

    public void lihatinmenu(View view) {
        startActivity(new Intent(Takeaway.this, Menu.class));
        finish();
    }
}
