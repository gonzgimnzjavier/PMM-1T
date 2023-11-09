package com.example.a28spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;


    static ArrayList<String> pueblaEspiner() {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Valladares");
        lista.add("chanderBrigthon");
        lista.add("Toledo");
        lista.add("Burgos");
        lista.add("Cuenca");
        return lista;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = findViewById(R.id.spinner);
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, pueblaEspiner());
        adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adaptador);

        //prueba
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
                Toast.makeText(parent.getContext(),
                        "Seleccionado: " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_SHORT).show();
            }

            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        // Create a message handling object as an anonymous class.
    /*private AdapterView.OnItemClickListener messageClickedHandler =
            new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View v, int position, long id) {
            // Display a messagebox.
            Toast.makeText(getApplicationContext(),
                    "Position: " + position, Toast.LENGTH_SHORT).show();
        }
    };*/

