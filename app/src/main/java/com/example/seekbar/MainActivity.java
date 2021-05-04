package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    SeekBar mSeekbarAlpha, mSeekbarRed, mSeekbarGreen, mSeekbarBlue;
    TextView txtHex, txtRBG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

//        mSeekbarAlpha.setOn
    }

    private void init() {
        mSeekbarAlpha = findViewById(R.id.seekbarAlpha);
        mSeekbarRed = findViewById(R.id.seekbarRed);
        mSeekbarGreen = findViewById(R.id.seekbarGreen);
        mSeekbarBlue = findViewById(R.id.seekbarBlue);
        txtHex = findViewById(R.id.txtHex);
        txtRBG = findViewById(R.id.txtRBG);
    }
}