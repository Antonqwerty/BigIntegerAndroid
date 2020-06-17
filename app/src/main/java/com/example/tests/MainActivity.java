package com.example.tests;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity {

    private EditText x;
    private EditText y;
    private TextView result;
    private Button okButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        x = findViewById(R.id.x);
        y = findViewById(R.id.y);
        result = findViewById(R.id.result);
        okButton = findViewById(R.id.okButton);
    }

    @SuppressLint("SetTextI18n")
    public void calc(View view) {
        //result.setText("hi");
        /*long xx = Long.parseLong(x.getText().toString());
        long yy = Long.parseLong(y.getText().toString());
        long z = xx + yy;
        result.setText(Long.toString(z));*/
        result.setText("hi");
        BigInteger xx = new BigInteger(String.valueOf(x.getText()));
        BigInteger yy = new BigInteger(String.valueOf(y.getText()));
        BigInteger z = xx.add(yy);
        result.setText(z.toString());
        okButton.setText(z.toString());
    }
}
