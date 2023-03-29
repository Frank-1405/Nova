package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataMarte extends AppCompatActivity {
    ImageView regresarM;

    MediaPlayer mp;

    ImageView playMarte;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_marte);
        regresarM = (ImageView) findViewById(R.id.regresarM);

        playMarte = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infomarte);

        regresarM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataMarte.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playMarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}