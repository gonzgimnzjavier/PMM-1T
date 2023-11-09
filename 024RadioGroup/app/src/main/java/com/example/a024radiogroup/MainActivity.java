package com.example.a024radiogroup;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroup;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.pica);
        radioGroup.setOnCheckedChangeListener((group, checkedId) -> onCheckedChanged(group, checkedId));
        checkBox = findViewById(R.id.checkBox);
        checkBox.setOnClickListener(buttonView, isChecked) -> onCheckedChanged(buttonView, isChecked);


    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        //Toast.makeText(this, "Has PICADO"+i, Toast.LENGTH_LONG).show();
        TextView t = (TextView) findViewById(R.id.respuesta);
            if (R.id.Button == checkedId) {
                t.setText("Coruxo FC");
            }
            else if (R.id.Button2 == checkedId) {
                t.setText("Coia FC");
            }
            else if (R.id.Button3 == checkedId) {
                t.setText("Valladares FC");
            }
            else (R.id.Button4 == checkedId) {
            t.setText("Rapido de Bouzas");
        }
        }

        public void onCheckedChanged(CompoundButton c, boolean b) {
            TextView t = findViewById(R.id.respuesta);
            if (b) {
                t.setText(t.getText().toString()+"Me gusta er furbo");
            }
            else {
                t.setText(t.getText().toString()+"No me gusta er furbo");
            }
        }
    }
