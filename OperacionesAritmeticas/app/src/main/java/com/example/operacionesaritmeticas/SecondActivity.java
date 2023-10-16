package com.example.operacionesaritmeticas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView1;
    TextView textView2;
    Button sumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView1=findViewById(R.id.textViews1);
        textView2=findViewById(R.id.TextViews2);
        Bundle llegar = getIntent().getExtras();
        String texto1 = llegar.getString("numero1");
        String texto2 = llegar.getString("numero2");
        textView1.setText(texto1);
        textView2.setText(texto2);
    }
}