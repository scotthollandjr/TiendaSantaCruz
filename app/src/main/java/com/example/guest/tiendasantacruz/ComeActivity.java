package com.example.guest.tiendasantacruz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ComeActivity extends AppCompatActivity {
    private TextView nTextView;
    private ListView mListView;
    private String[] comeItems = {"Crackers", "Sugar", "Cupcakes", "Garlic", "Vinegar", "Vanilla", "Cinnamon", "Beans", "Canola Oil", "Mayonnaise", "Bread", "Beef", "Cereal", "Eggs", "Oatmeal", "Corn", "Peas", "Cabbage", "Apples", "Bananas", "Grapes", "Mustard", "Oranges"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_come);

        mListView = (ListView) findViewById(R.id.listView4);
        nTextView = (TextView) findViewById(R.id.textView4);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, comeItems);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String comeItem = ((TextView) view).getText().toString();
                Toast.makeText(ComeActivity.this, comeItem, Toast.LENGTH_LONG).show();
            }
        });
    }

}
