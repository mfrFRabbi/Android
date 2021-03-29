package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView setText;
    private Button btn,imAndTextBtn;
    private ImageButton imBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setText = findViewById(R.id.textId);
        btn = findViewById(R.id.buttonId);
        imBtn = findViewById(R.id.imageButtonId);


 /*    btn.setOnClickListener(new Listener());
       imBtn.setOnClickListener(new Listener());*/
    }
/*
    class Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if(v.getId() == R.id.buttonId)
                setText.setText("Welcome!! Button");
            else if(v.getId() == R.id.imageButtonId)
                setText.setText("Welcome!! imageButton");
        }
    }
 */

    public void setListener(View view) {
        if(view.getId() == R.id.buttonId)
            Toast.makeText(this,"welcome!! button",Toast.LENGTH_SHORT).show();
        else if(view.getId() == R.id.imageButtonId) {
            Toast toast = Toast.makeText(this,"Welcome!! imageButton",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER,0,0);
            toast.show();
        }
    }
}