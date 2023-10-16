package com.example.a012gettingresult;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button button;
    TextView textView;
    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textView=findViewById(R.id.llegado);
        text = getIntent().getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(text);
        button = findViewById(R.id.volver);
        button.setOnClickListener(view -> volver(view));
    }
    public void volver(View view){
        Intent intent = new Intent();
        //pareja clave--> MainActivity.REQUEST_RESULT valor text.toUpperCase
        Intent returnIntent = new Intent();
        returnIntent.putExtra(MainActivity.REQUEST_RESULT,text.toUpperCase());
        //metodo especifico de staractivityforresult
        setResult(RESULT_OK,returnIntent);
        finish();
    }
}