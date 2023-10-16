package com.example.a012gettingresult;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String REQUEST_RESULT = "REQUEST_RESULT";
    public EditText editText;
    public Button button;
    public TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.boton);
        button.setOnClickListener(view -> onClickSwitch(view));
    }

    public void onClickSwitch(View view){
    editText = findViewById(R.id.cajita);
    String text = editText.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        startActivityForResult(intent, 1);
    }


//RECUPERAR DATOS DE REGRESO DE UNA DETERMINADA ACTIVIDAD CON CODIGO
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    //REVISAR
        if(resultCode == RESULT_OK){
            textView=findViewById(R.id.resultado);
            String texto = data.getStringExtra(REQUEST_RESULT);
            textView.setText(texto);
        }
    }
}


