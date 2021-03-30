package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private RadioGroup radioGroup;
    private Button btn;
    private TextView setText;
    private RadioButton selectedFood;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.radioGroup);

        btn = findViewById(R.id.showBtnID);
        setText = findViewById(R.id.showInTextView);


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