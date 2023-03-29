package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataPluton extends AppCompatActivity {
    ImageView regresarP;

    MediaPlayer mp;

    ImageView playPluton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_pluton);
        regresarP = (ImageView) findViewById(R.id.regresarP);

        playPluton = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infopluton);

        regresarP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataPluton.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playPluton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}