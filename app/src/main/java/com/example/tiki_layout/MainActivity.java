package com.example.tiki_layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements SendingData {
    TextView txtTotal ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtTotal = findViewById(R.id.txtTotal);

    }

    @Override
    public void sendData(String data) {
        txtTotal.setText(data);
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout,BlankFragment.newInstance(data)).commit();
    }

}