package com.example.a025toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements ToggleButton.OnCheckedChangeListener {

    ToggleButton toggleButton;
    Switch switch1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toggleButton = findViewById(R.id.toggleButton);
        toggleButton.setOnCheckedChangeListener((buttonView, isChecked) -> onCheckedChanged(buttonView, isChecked));
        switch1 = findViewById(R.id.switch1);
        switch1.setOnCheckedChangeListener((buttonView, isChecked) -> onCheckedChanged(buttonView, isChecked));
    }

    public  void manolito(Switch switch1, boolean isChecked){
        ImageView imageView = findViewById(R.id.imageView);
        if (isChecked) {
            imageView.setImageResource(R.drawable.avatar_1);
        } else {
            imageView.setImageResource(R.drawable.avatar_2);
        }

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        ImageView imageView = findViewById(R.id.imageView);
        if (isChecked) {
            imageView.setImageResource(R.drawable.avatar_1);
        } else {
            imageView.setImageResource(R.drawable.avatar_2);
        }
    }
}