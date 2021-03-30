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
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private CheckBox milk,sugar,water;
  private Button btn;
  private TextView setText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        milk = findViewById(R.id.milkCheB);
        sugar = findViewById(R.id.sugarCheB);
        water = findViewById(R.id.waterCheB);
        btn = findViewById(R.id.showBtnID);
        setText = findViewById(R.id.showInTextView);


    }

    public void setListener(View view) {
        Toast.makeText(this,"click",Toast.LENGTH_SHORT).show();

        if(view.getId() == R.id.showBtnID){
            StringBuilder strBuilder = new StringBuilder();

            if(milk.isChecked()){
                strBuilder.append(milk.getText().toString()+" is ordered"+"\n");
            }
            if(water.isChecked()){
                strBuilder.append(water.getText().toString()+" is ordered"+"\n");
            }
            if(sugar.isChecked()){
                strBuilder.append(sugar.getText().toString()+" is ordered"+"\n");
            }
            setText.setText(strBuilder);
        }

    }
}