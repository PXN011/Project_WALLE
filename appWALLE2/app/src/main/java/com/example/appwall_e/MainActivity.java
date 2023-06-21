package com.example.appwall_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void abrirTela (View V){
        Intent planta=new Intent(this,planta.class);
        startActivity (planta);
    }
    public void abrirRobot (View z){
        Intent robot=new Intent (this, robo.class);
        startActivity (robot);
    }
}