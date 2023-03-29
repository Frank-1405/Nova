package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataLuna extends AppCompatActivity {
    ImageView regresarL;

    MediaPlayer mp;

    ImageView playLuna;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_luna);
        regresarL = (ImageView) findViewById(R.id.regresarL);

        playLuna = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infoluna);

        regresarL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataLuna.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playLuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}