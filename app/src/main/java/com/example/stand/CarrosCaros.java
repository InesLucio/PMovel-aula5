package com.example.stand;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

public class CarrosCaros extends AppCompatActivity {
    Spinner sp;
    TextView tv;
    public String carros [] = {"BMW","Ferrari","Mercedes Benz","Porche"};
    public int imagens[] = {R.drawable.bmw, R.drawable.ferrari, R.drawable.mercedes, R.drawable.porche};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carros_caros);
    }
}