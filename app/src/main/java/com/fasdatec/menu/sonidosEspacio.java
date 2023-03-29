package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.BufferedReader;

public class sonidosEspacio extends AppCompatActivity {
MediaPlayer mp;
ImageView alien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sonidos_espacio);

        alien = (ImageView) findViewById((R.id.alien));

        mp =    MediaPlayer.create(this, R.raw.astronauta);

        alien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}