package com.example.appwall_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class planta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planta);
    }
    public void abrirCine (View z){
        Intent robo=new Intent (this, robo.class);
        startActivity (robo);
    }
}