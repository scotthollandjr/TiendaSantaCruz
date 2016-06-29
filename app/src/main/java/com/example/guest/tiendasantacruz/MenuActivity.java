package com.example.guest.tiendasantacruz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private TextView nTextView;
    private ListView mListView;
    private String[] menuItems = {"Enchiladas Green Salsa", "Enchiladas Red Sauce", "Tostada Super", "Vegetarian Tostada", "Carne Asada", "Ceviche Tostada", "Shrimp Tostada", "Taco Regular", "Taco Super", "Vegetarian Taco", "Shrimp Taco", "Breakfast Burrito", "Mojado Burrito", "Super Burrito", "Shrimp Burrito", "Regular Burrito", "Vegetarian Burrito", "Chile Relleno Burrito", "Sopes", "Gorditas", "Vegetarian Gorditas", "Torta", "Torta Milanesa", "Vegetarian Torta", "Flautas", "Flour Flautas", "Potato Taquitos", "Tacos Dorados", "Nachos Regular", "Nachos Super"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mListView = (ListView) findViewById(R.id.listView2);
        nTextView = (TextView) findViewById(R.id.textView2);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, menuItems);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String menuItem = ((TextView) view).getText().toString();
                Toast.makeText(MenuActivity.this, menuItem, Toast.LENGTH_LONG).show();
            }
        });
    }
}