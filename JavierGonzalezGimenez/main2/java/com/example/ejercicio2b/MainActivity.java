package com.example.ejercicio2b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Pais> contenido = crearPais();
        recyclerAdapter adaptadorRecycler = new com.example.ejercicio2b.recyclerAdapter(this, 0 , contenido);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setAdapter(adaptadorRecycler);
        recyclerView.setSelected(false);
    }

    public void ArrayList<Pais> crearPais(){
        ArrayList<Pais> paises = new ArrayList<>();
        Pais alemania = new Pais(R.drawable.alemania, "Alemania", "Berlin", 82470625, "357375");
        Pais grecia = new Pais(R.drawable.grecia, "Grecia", "Atenas", 10432481, "131957");
        Pais
    }
}