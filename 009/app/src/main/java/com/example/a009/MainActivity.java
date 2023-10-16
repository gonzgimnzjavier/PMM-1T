package com.example.a009;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button miboton;
    Button miboton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miboton = findViewById(R.id.boton);
        miboton.setOnClickListener(view -> lanzarActividad(view));
        miboton2 = findViewById(R.id.boton2);
        miboton2.setOnClickListener(view -> mandarMensaje(view));
    }

    public void mandarMensaje(View view){
        CharSequence textMessage="esto es un mensaje";
        Uri uri = Uri.parse("smsto:"+"12346556");

         Intent sendIntent = new Intent(Intent.ACTION_SENDTO,uri);
         sendIntent.putExtra(Intent.EXTRA_TEXT,textMessage);
/*
       //sendIntent.putExtra(Intent.ACTION_SENDTO,1234);
        sendIntent.putExtra("address","123456789");
        sendIntent.putExtra(Intent.EXTRA_TEXT, textMessage);
        sendIntent.setType("text/plain");*/

      //  if (sendIntent.resolveActivity(getPackageManager())!=null){
           startActivity(sendIntent);
       // }

    }

    public void lanzarActividad(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.cebem.net"));
        startActivity(intent);
    }
}