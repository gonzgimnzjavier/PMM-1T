package com.example.operacionesaritmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText numero1;
    EditText numero2;
    Button boton;
    TextView resultado;
    public static final String REQUEST_RESULT = "REQUEST_RESULT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton = findViewById(R.id.boton);
        boton.setOnClickListener(view -> onClick(view));
    }
    public void onClick(View view) {
        numero1 = findViewById(R.id.cajita1);
        String texto1 = numero1.getText().toString();
        numero2 = findViewById(R.id.cajita2);
        String texto2 = numero2.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("numero1", texto1);
        bundle.putString("numero2", texto2);
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtras(bundle);
        startActivityForResult(intent, 1);
    }
}