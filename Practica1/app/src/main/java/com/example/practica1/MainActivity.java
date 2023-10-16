package com.example.practica1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText miEditText;

    TextView  miTextView;

    Button mibutton;

    static final Integer[] primo = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miEditText=findViewById(R.id.numero);
        miTextView=findViewById(R.id.resultado);
        mibutton=findViewById(R.id.boton);
        mibutton.setOnClickListener(view -> calculaPrimo(view));
    }
    public void calculaPrimo(View view) {
        try {
            Integer numero = Integer.parseInt(miEditText.getText().toString());

            if (numero >= 0 && numero < primo.length) {
                miTextView.setText(primo[numero-1].toString());
            } else {
                miTextView.setText("Número fuera de rango");
            }
        } catch (NumberFormatException e) {
            miTextView.setText("Ingrese un número válido");
        }
    }
}