package com.example.a026calendarpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements CalendarView.OnDateChangeListener {

    CalendarView calendarView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calendarView = findViewById(R.id.calendario);
        calendarView.setOnDateChangeListener(((view, year, month, dayOfMonth) -> onSelectedDayChange(view, year, month, dayOfMonth)));
        button = findViewById(R.id.boton);
        button.setOnClickListener((v) -> onClikListener());

    }

    @Override
    public void onSelectedDayChange(CalendarView view, int year, int month, int dayOfMonth) {
        TextView textView = findViewById(R.id.fecha);
        String fecha = dayOfMonth + "/" + (month + 1) + "/" + year;
        textView.setText(fecha);
    }

    private void onClikListener() {
        EditText editText = findViewById(R.id.data);
        String data = editText.getText().toString();

        String part[] = data.split("/");

        int day = Integer.parseInt(part[2]);
        int month = Integer.parseInt(part[1]);
        int year = Integer.parseInt(part[0]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);
        calendar.set(Calendar.DAY_OF_MONTH, day);

        long milliTime = calendar.getTimeInMillis();
        calendarView.setDate(milliTime, true, true);

    }
}