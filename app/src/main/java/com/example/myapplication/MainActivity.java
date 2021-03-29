package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText one,two;
private Button plus,minus;
private TextView setText;
double a,b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one = findViewById(R.id.firstText);
        two = findViewById(R.id.secondText);
        plus = findViewById(R.id.buttonId);
        minus = findViewById(R.id.buttonId2);
        setText = findViewById(R.id.resId);

    }

    public void setListener(View view) {


        try {
            a = Double.parseDouble(one.getText().toString());
            b = Double.parseDouble(one.getText().toString());
            if(view.getId() == R.id.buttonId){
                double res;
                res = a+b;
                setText.setText(String.valueOf(res));
            }
            else if(view.getId() == R.id.buttonId2) {
                double res;
                res = a-b;
                setText.setText(String.valueOf(res));
            }
        }catch (Exception e){
            Toast toast = Toast.makeText(this,"Please Enter Number",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER_VERTICAL|Gravity.START ,0,90);
            toast.show();
        }

    }
}