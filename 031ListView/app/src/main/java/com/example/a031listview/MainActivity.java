package com.example.a031listview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lista);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, pueblaLista());
        listView.setAdapter(adaptador);
        listView.setOnItemClickListener(this);
    }

    public static List<String> pueblaLista() {
        List<String> clubs = new ArrayList<>();
        clubs.add("Arenteiro");
        clubs.add("Depor");
        clubs.add("Lugo");
        clubs.add("Zelta B");
        clubs.add("Compos");
        clubs.add("Ponte");
        return clubs;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String item = (String) parent.getItemAtPosition(position);
        Toast.makeText(this, "Clicked: " + item, Toast.LENGTH_SHORT).show();
    }
}
