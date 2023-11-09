package com.example.a021recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<String> nameList = new ArrayList<>();
        nameList.add("China");
        nameList.add("France");
        nameList.add("Germany");
        nameList.add("India");
        nameList.add("Russia");
        nameList.add("United Kingdom");
        nameList.add("United States");


        List<String> detailList = new ArrayList<>();
        detailList.add("Asia");
        detailList.add("Europe");
        detailList.add("Europe");
        detailList.add("Asia");
        detailList.add("Asia");
        detailList.add("Europe");
        detailList.add("North America");


        RecyclerView recyclerView = findViewById(R.id.reciclaje);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        recyclerView.setLayoutManager(linearLayoutManager);


        MiAdaptador miAdaptador = new MiAdaptador(nameList, detailList);
        recyclerView.setAdapter(miAdaptador);
    }
}
