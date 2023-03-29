package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataMercurio extends AppCompatActivity {
    ImageView regresarMe;

    MediaPlayer mp;

    ImageView playMercurio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_mercurio);
        regresarMe = (ImageView) findViewById(R.id.regresarMe);

        playMercurio = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infomercurio);

        regresarMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataMercurio.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playMercurio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}