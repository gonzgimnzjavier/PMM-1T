package com.example.a016inflandolayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button izq,der;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        izq = findViewById(R.id.botonizquierdo);
        izq.setOnClickListener(view -> clickizquierdo(view));

    }

    public void clickizquierdo(View view) {
        setContentView(R.layout.activity_main2);
        der=findViewById(R.id.botonderecho);
        der.setOnClickListener(v -> clickderecho(view));
    }

    public void clickderecho(View view) {
        setContentView(R.layout.activity_main);
        izq = findViewById(R.id.botonizquierdo);
        izq.setOnClickListener(v -> clickizquierdo(view));
    }
}