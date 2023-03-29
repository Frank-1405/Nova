package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataUrano extends AppCompatActivity {
    ImageView regresarU;

    MediaPlayer mp;

    ImageView playUrano;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_urano);
        regresarU = (ImageView) findViewById(R.id.regresarU);

        playUrano = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infourano);

        regresarU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataUrano.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playUrano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}