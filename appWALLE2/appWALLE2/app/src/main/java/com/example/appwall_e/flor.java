package com.example.appwall_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class flor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flor);
    }
    public void abrirHome (View w){
        Intent flor=new Intent (this,MainActivity.class);
        startActivity(flor);
    }
}