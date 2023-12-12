package com.example.ejercicio3b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    GridLayout grid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        grid = findViewById(R.id.gridLayout);
        numsAleatorios();
        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numsAleatorios();
            }
        });

    }

    private void numsAleatorios(){
        grid.removeAllViews();
        Random random = new Random();
        for (int i = 0; i < 5 * 4; i++) {
            Button button = new Button(this);
            int numero = random.nextInt(49) + 1;
            button.setText(String.valueOf(numero));

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ((Button) v).setText("RR");
                }
            });

            grid.addView(button);
        }

    }

}