package com.example.ejercicio1b;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if(intent != null) {
            int pies = intent.getIntExtra("pies", 0);
            int pulgadas = intent.getIntExtra("pulgadas", 0);

            TextView textviewPies = (TextView) findViewById(R.id.primerDato);
            TextView textviewPulgadas = (TextView) findViewById(R.id.segundoDato);

            textviewPies.setText(pies + " pies");
            textviewPulgadas.setText(pulgadas + " pulgadas");
        }
    }

    public void onClickClose(View view){
        Intent returnIntent = new Intent();
        double num = Double.parseDouble(((TextView)findViewById(R.id.numero)).getText().toString());
        returnIntent.putExtra(MainActivity.REQUEST_RESULT, num);
        setResult(RESULT_OK, returnIntent);
        finish();
    }
    public void sumar(View v){
        TextView tvPies = (TextView) findViewById(R.id.primerDato);
        TextView tvPulgadas = (TextView) findViewById(R.id.segundoDato);

        int pies = Integer.parseInt(tvPies.getText().toString().split(" ")[0]);
        int pulgadas = Integer.parseInt(tvPulgadas.getText().toString().split(" ")[0]);

        double suma = pies * 30.48 + pulgadas * 2.54;
        ((TextView)findViewById(R.id.numero)).setText(String.valueOf(suma));
    }

}