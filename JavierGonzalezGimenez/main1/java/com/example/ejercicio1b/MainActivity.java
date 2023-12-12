package com.example.ejercicio1b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String REQUEST_RESULT = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSwitchActivity(View v){
        Intent intent = new Intent(this, SecondActivity.class);
        EditText etPies = (EditText) findViewById(R.id.editTextPies);
        EditText etPulgadas = (EditText) findViewById(R.id.editTextPulgadas);
        int pulgadas = Integer.parseInt(etPulgadas.getText().toString());
        if(pulgadas > 11){
            ((TextView)findViewById(R.id.retorno)).setText("ERROR HAS INSERTADO MAS DE 11 PULGADAS");
            return;
        }
        int pies = Integer.parseInt(etPies.getText().toString());
        intent.putExtra("pies", pies);
        intent.putExtra("pulgadas", pulgadas);
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK){
            ((TextView)findViewById(R.id.retorno)).setText(data.getDoubleExtra(REQUEST_RESULT,
                    0) + "centimertros");
        }

    }

}