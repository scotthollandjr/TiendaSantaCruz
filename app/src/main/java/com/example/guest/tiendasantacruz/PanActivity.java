package com.example.guest.tiendasantacruz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class PanActivity extends AppCompatActivity {
    private TextView mTextView3;
    private ListView mListView;
    private String[] panDulces = new String[] {"Almohadas", "Antao", "Barquillos", "Barras para rebanadas", "Besos", "Bicicletas", "Bigotes", "Birotes", "Bisquets", "Bocados", "Bolillos", "Budn", "Burritas", "Calabazas", "Calvos", "Canastas", "Caracoles", "Cemitas", "Chafaldrana", "Chicharrones", "Chilindrinas", "Chirimoyas", "Chirindolfo", "Cocoles", "Colchones", "Conchas", "Congal", "Cuernos", "de", "mantequilla", "Cuernos de vapor", "Donas", "El Doroteo", "Elotes", "Galletas", "de", "coco", "Gendarmes", "Guarapo", "Gusanos", "Gusarapo", "Hojaldras", "Ladrillos", "Manitas", "Mexicanos", "Moos de dans", "Mundos", "Neblinas", "Novias", "Orejas", "Pachucos", "Pan catarino", "Pan de caja", "Pan de elote", "Pan de feria", "Pan de muerto", "Pan de pueblo", "Pan de pulque", "Pan de royal", "Pan de trenzas", "Pan de yema", "Pan decorado con letras", "Pan en forma de corazon", "Pan en forma de tornillo", "Pan integral con salvado", "Pan mestizo", "Pan redondo", "bordado", "Pan redondo o moreliano", "Pan topico de  nuez", "Panquecitos", "Piedras", "Rebanadas", "Rehiletes", "Rieles", "Rosca de reyes", "Roscas de canela", "Soles", "Tanas", "Teleras", "Trenzas", "Yolandas", "Yoyos"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pan);

        mListView = (ListView) findViewById(R.id.listView);
        mTextView3 = (TextView) findViewById(R.id.textView3);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, panDulces);
        mListView.setAdapter(adapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String pan = ((TextView)view).getText().toString();
                Toast.makeText(PanActivity.this, pan, Toast.LENGTH_LONG).show();
            }
        });
    }
}
