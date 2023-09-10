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

    public void ApresentarLixo(View v){
        Intent CatalogoLixo = new Intent(this,CatalogoLixo.class);
        startActivity(CatalogoLixo);
    }

    public void ApresentarPlanta(View v){
        Intent CatalogoPlanta = new Intent(this, CatalogoPlanta.class);
        startActivity(CatalogoPlanta);

    }
    public void IrMapa(View v){
        Intent Mapa = new Intent(this, Mapa.class);
        startActivity(Mapa);

    }
}
