package com.example.a011senddata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.a011senddata.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButton;
    EditText editText;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageButton = findViewById(R.id.careto);
        imageButton.setOnClickListener(view -> onClickSwitch(view));
    }
    /*public void onClickSwitch(View view) {


        //pasar datos???
        editText = (EditText) findViewById(R.id.cajita);
        String text = editText.getText().toString();
        editText2 = (EditText) findViewById(R.id.cajita2);
        String text2  = editText2.getText().toString();
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        intent.putExtra(Intent.EXTRA_TEXT2,text+"_"+edittext2) ;
        startActivity(intent);
    }*/
    public void onClickSwitch(View view) {
        // Obtener el texto de los EditText
        editText = (EditText) findViewById(R.id.cajita);
        String text = editText.getText().toString();
        editText2 = (EditText) findViewById(R.id.cajita2);
        String text2 = editText2.getText().toString();

        // Crear un Bundle y agregar los datos
        Bundle extras = new Bundle();
        extras.putString("user", text);
        extras.putString("pass", text2);

        // Crear un Intent y pasar el Bundle
        Intent intent = new Intent(this, LoginActivity.class);
        intent.putExtras(extras);

        // Iniciar la actividad con el Intent
        startActivity(intent);
    }

}