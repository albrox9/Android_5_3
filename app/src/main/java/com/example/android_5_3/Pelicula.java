package com.example.android_5_3;

import java.io.Serializable;

public class Pelicula implements Serializable {

    private String nombre;
    private int anio;

    public Pelicula() {
    }

    public Pelicula(String nombre, int anio) {
        this.nombre = nombre;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return nombre + " " + anio;
    }
}
