package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class dataSaturno extends AppCompatActivity {
    ImageView regresarSa;

    MediaPlayer mp;

    ImageView playSaturno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_saturno);
        regresarSa = (ImageView) findViewById(R.id.regresarSa);

        playSaturno = (ImageView) findViewById(R.id.playimg);


        mp =    MediaPlayer.create(this, R.raw.infosaturno);

        regresarSa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(dataSaturno.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        playSaturno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mp.start();

            }
        });
    }
}