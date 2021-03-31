package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button btn;
    private TextView setText;
    private RadioButton selectedFood;
    //ratingBar
    private RatingBar ratingBar;
    private TextView textView;
    //seekBar
    private SeekBar seekBar;
    //switch
    private Switch aSwitch;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);

        btn = findViewById(R.id.showBtnID);
        setText = findViewById(R.id.showInTextView);

        //ratingBar
        ratingBar = findViewById(R.id.ratingBar);
        textView = findViewById(R.id.rateTextId);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText(String.valueOf(rating));
            }
        });

        //seekBar
        seekBar = findViewById(R.id.seekBarId);
        textView.setText("Value: = "+seekBar.getProgress()+" /"+ seekBar.getMax());
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                textView.setText("Value: = "+progress+" /"+ seekBar.getMax());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        //switch
        aSwitch = findViewById(R.id.switchId);
        aSwitch.setOnCheckedChangeListener((CompoundButton buttonView, boolean isChecked) -> {
            if(isChecked){
                Toast.makeText(MainActivity.this,"ON",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(MainActivity.this,"OFF",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void setListener(View view) {
        Toast.makeText(this, "click", Toast.LENGTH_SHORT).show();

        if (view.getId() == R.id.showBtnID) {
            int select = radioGroup.getCheckedRadioButtonId();

            selectedFood = findViewById(select);
            setText.setText(selectedFood.getText().toString());
        }

    }
}