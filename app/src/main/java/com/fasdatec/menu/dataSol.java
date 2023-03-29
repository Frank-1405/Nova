package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataSol extends AppCompatActivity {
    ImageView regresarS;

    MediaPlayer mp;

    ImageView playSol;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_sol);

        regresarS = (ImageView) findViewById(R.id.regresarS);

         playSol = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infosol);

        regresarS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataSol.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}