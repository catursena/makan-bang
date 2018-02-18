package com.example.caturm4.catur_1202152171_modul2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Menu extends AppCompatActivity {
    RecyclerView rv;
    Menuadapter adapter;
    List<Pilihanmenu> listmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Menu");

        listmenu = new ArrayList<>();
        rv = findViewById(R.id.list_menu);
        rv.setHasFixedSize(true);
        rv.setLayoutManager(new LinearLayoutManager(this));
        initdata();
    }
    private void initdata(){
        listmenu.add(new Pilihanmenu(R.drawable.pizza, "Pizza Enak", 150000, "Roti pizza dengan sosis panggang yg di baluri dengan keju berkualitas"));
        listmenu.add(new Pilihanmenu(R.drawable.lasagna, "Lasagna Lezat", 55000, "Daging, keju, mayonaise"));
        listmenu.add(new Pilihanmenu(R.drawable.burger, "Burger", 25000, "Burger nikmat dengan daging pilihan yg terasa sangat lezat di lidah"));
        listmenu.add(new Pilihanmenu(R.drawable.spaghetti, "Spaghetti bolognaise", 15000, "Pasta lezat pilihan yang di campur dengan saos bolognaise nikmat"));
        listmenu.add(new Pilihanmenu(R.drawable.salad, "Salad", 50000, "Kol, Wortel, Jagung"));
        adapter = new Menuadapter(this, listmenu);
        rv.setAdapter(adapter);
    }
}