package com.example.appwall_e;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Mapa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);


    }
    public void ApresentarMapa(View v) {

        Uri location = Uri.parse("geo:-23.5208185,-46.7323999,17z=14");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW,location);
        startActivity(mapIntent);
    }
}

