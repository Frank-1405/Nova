package com.fasdatec.menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class menuActivity extends AppCompatActivity {
    ImageView sistemaSolar;
    ImageView sonidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        sistemaSolar = (ImageView) findViewById(R.id.sistemaSolar);
        sonidos = (ImageView) findViewById(R.id.sonidos);

        sistemaSolar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuActivity.this, menuSistemaSolar.class);
                startActivity(i);

            }
        });
        sonidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(menuActivity.this, sonidosEspacio.class);
                startActivity(i);

            }
        });
    }
}