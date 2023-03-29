package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataTierra extends AppCompatActivity {
    ImageView regresarT;

    MediaPlayer mp;

    ImageView playTierra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_tierra);
        regresarT = (ImageView) findViewById(R.id.regresarT);

        playTierra = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infotierra);

        regresarT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataTierra.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playTierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}