package com.example.a015persistenciadatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    static final String KEY_COUNTER = "CONTADOR";

    static final String KEY_NAME = "NOMBRE";
    private int miContador=0;
    EditText editText;
    TextView textView;

    String texto="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //codigo para recuperar un valor de un fichero de preferencias
        //SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences mias= getSharedPreferences("MIFICHERO", MODE_PRIVATE);
        int defaultCounter = 0;
        miContador = mias.getInt(KEY_COUNTER, defaultCounter);
        String defaultText = "";
        texto = mias.getString(KEY_NAME, defaultText);
        editText = findViewById(R.id.caja);
        editText.setText(texto);
        textView=findViewById(R.id.resultado);
        textView.setText("Contador: "+Integer.toString(miContador));
    }
    public void contador(View view){
        miContador++;
        TextView textView = findViewById(R.id.resultado);
        textView.setText("Contador: "+Integer.toString(miContador));
    }
    // METODO PARA GUARDAR VALORES
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COUNTER, miContador);
    }
    // METODO PARA RECUPERAR VALORES
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        miContador = savedInstanceState.getInt(KEY_COUNTER);
        textView=findViewById(R.id.resultado);
        textView.setText("Contador: "+Integer.toString(miContador));
    }
    //GUARDADO DE PREFERENCIAS
    @Override
    protected void onPause() {
        super.onPause();
       // SharedPreferences settings = getPreferences(MODE_PRIVATE);
        SharedPreferences misPreferencias = getSharedPreferences("MIFICHERO", MODE_PRIVATE);
        SharedPreferences.Editor editor = misPreferencias.edit();
        editor.putInt(KEY_COUNTER, miContador);
        editText = findViewById(R.id.caja);
        texto = editText.getText().toString();
        editor.putString(KEY_NAME, editText.getText().toString());
        //solo escribe con una llamada al metodo commit
        editor.commit();
    }

}