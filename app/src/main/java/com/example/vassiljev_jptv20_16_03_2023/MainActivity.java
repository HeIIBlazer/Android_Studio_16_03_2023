package com.example.vassiljev_jptv20_16_03_2023;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view) {
        TextView textView = findViewById(R.id.textView);
        textView.setText("ЗДРАВИЯ ЖЕЛАЮ!");
    }
}