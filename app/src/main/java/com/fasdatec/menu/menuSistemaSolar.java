package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class menuSistemaSolar extends AppCompatActivity {

    ImageView regresar;
    ImageView infoSol;
    ImageView infoMercurio;
    ImageView infoVenus;
    ImageView infoTierra;
    ImageView infoLuna;
    ImageView infoMarte;
    ImageView infoJupiter;
    ImageView infoSaturno;
    ImageView infoUrano;
    ImageView infoNeptuno;
    ImageView infoPluton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistema_solar);
        regresar = (ImageView) findViewById(R.id.regresar);
        infoSol = (ImageView) findViewById(R.id.infoSol);
        infoMercurio = (ImageView) findViewById(R.id.infoMercurio);
        infoVenus = (ImageView) findViewById(R.id.infoVenus);
        infoTierra = (ImageView) findViewById(R.id.infoTierra);
        infoLuna = (ImageView) findViewById(R.id.infoLuna);
        infoMarte = (ImageView) findViewById(R.id.infoMarte);
        infoJupiter = (ImageView) findViewById(R.id.infoJupiter);
        infoSaturno = (ImageView) findViewById(R.id.infoSaturno);
        infoUrano = (ImageView) findViewById(R.id.infoUrano);
        infoNeptuno = (ImageView) findViewById(R.id.infoNeptuno);
        infoPluton = (ImageView) findViewById(R.id.infoPluton);

        infoSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataSol.class);
                startActivity(i);

            }
        });
        infoMercurio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataMercurio.class);
                startActivity(i);

            }
        });
        infoVenus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataVenus.class);
                startActivity(i);

            }
        });
        infoTierra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataTierra.class);
                startActivity(i);

            }
        });
        infoLuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataLuna.class);
                startActivity(i);

            }
        });
        infoMarte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataMarte.class);
                startActivity(i);

            }
        });
        infoJupiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataJupiter.class);
                startActivity(i);

            }
        });
        infoSaturno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataSaturno.class);
                startActivity(i);

            }
        });
        infoUrano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataUrano.class);
                startActivity(i);

            }
        });
        infoNeptuno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataNeptuno.class);
                startActivity(i);

            }
        });
        infoPluton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, dataPluton.class);
                startActivity(i);

            }
        });

        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuSistemaSolar.this, menuActivity.class);
                startActivity(i);

            }
        });
    }
}