package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.ZoomControls;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private ZoomControls zoomControls;
private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        zoomControls = findViewById(R.id.zoomId);
        image = findViewById(R.id.imageId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = image.getScaleX();
                float y = image.getScaleY();
                image.setScaleX((float)x+1);
                image.setScaleY((float)y+1);

            }
        });
        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float x = image.getScaleX();
                float y = image.getScaleY();
                if(x>1 && y>1){
                    image.setScaleX((float) x-1);
                    image.setScaleY((float)y-1);
                }


            }
        });

    }

    @Override
    public void onClick(View v) {

    }


}
