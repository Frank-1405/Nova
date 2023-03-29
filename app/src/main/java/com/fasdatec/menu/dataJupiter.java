package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class dataJupiter extends AppCompatActivity {
    ImageView regresarJ;

    MediaPlayer mp;

    ImageView playJupiter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_jupiter);
        regresarJ = (ImageView) findViewById(R.id.regresar);

        playJupiter = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infojupiter);

        regresarJ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataJupiter.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playJupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}