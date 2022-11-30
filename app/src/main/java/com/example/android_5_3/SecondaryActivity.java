package com.example.android_5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SecondaryActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1;
    RadioButton rb2;
    RadioButton rb3;
    RadioButton rb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);
        escogerPeli();
        mensajeRecibido();

    }

    private String mensajeRecibido() {

        String alabanza = getIntent().getStringExtra("alabanza");
        return alabanza;
    }

    private void escogerPeli() {
        this.rg = findViewById(R.id.idRg);
        rg.setOnCheckedChangeListener((rg, i)-> actualizar());

    }

    private String actualizar() {

        String mensaje = "";

        switch (rg.getCheckedRadioButtonId()){
            case R.id.rb1: mensaje = "2001: Una odisea del espacio"; break;
            case R.id.rb2: mensaje = "El señor de los anillos"; break;
            case R.id.rb3: mensaje = "La lista de Schindler"; break;
            case R.id.rb4: mensaje = "Forrest Gump"; break;
        }

        return mensaje;
    }

    public void responder(View view) {

        String mensaje = actualizar() + " " + mensajeRecibido();


        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("contestacion",  mensaje);
        setResult(RESULT_OK, i);
        finish();
    }
}