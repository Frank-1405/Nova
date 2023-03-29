package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataNeptuno extends AppCompatActivity {
    ImageView regresarN;

    MediaPlayer mp;

    ImageView playNeptuno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_neptuno);
        regresarN = (ImageView) findViewById(R.id.regresarN);

        playNeptuno = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infoneptuno);

        regresarN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataNeptuno.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playNeptuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}