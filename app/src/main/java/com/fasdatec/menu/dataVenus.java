package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataVenus extends AppCompatActivity {
    ImageView regresarV;

    MediaPlayer mp;

    ImageView playVenus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_venus);
        regresarV = (ImageView) findViewById(R.id.regresarV);

        playVenus = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infovenus);

        regresarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataVenus.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playVenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}