package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button setTime,timeDialog;
private TimePicker timePicker;
private TextView timeText,reviewTimeText,timeTextTwo;

private TimePickerDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTime = findViewById(R.id.showTimeId);
        timeDialog = findViewById(R.id.dialog_buttonId);
        timePicker = findViewById(R.id.timePickerId);

        timeText = findViewById(R.id.showTimeTextId);
        timeTextTwo = findViewById(R.id.timeTextId);

        timePicker.setIs24HourView(true);
        setTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String time = timePicker.getCurrentHour() +":"+timePicker.getCurrentMinute();
                timeText.setText(time);
            }
        });

        timeDialog.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        TimePicker timePicker = new TimePicker(this);

        dialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        String time = hourOfDay +":"+minute;
                        timeTextTwo.setText(time);
                    }
                },
                timePicker.getCurrentHour(),
                timePicker.getCurrentMinute(),true);
        dialog.show();

    }
}
