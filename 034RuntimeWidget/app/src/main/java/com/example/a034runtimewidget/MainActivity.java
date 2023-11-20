package com.example.a034runtimewidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constraintLayout = findViewById(R.id.layout);
        TextView textView = findViewById(R.id.texto);

        DatePicker datePicker = new DatePicker(this);
        datePicker.setId(View.generateViewId());
        //crear constrains para el picker
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.clone(constraintLayout);

        constraintSet.centerHorizontally(datePicker.getId(), ConstraintSet.PARENT_ID);
        constraintSet.centerVertically(datePicker.getId(), ConstraintSet.PARENT_ID);
        constraintSet.applyTo(constraintLayout);

        constraintLayout.addView(datePicker);
    }
}