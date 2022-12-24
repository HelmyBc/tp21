package com.example.tp21;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv=findViewById(R.id.counter_text);
        String ch =getIntent().getStringExtra("val");
        tv.setText(ch);

    }

}