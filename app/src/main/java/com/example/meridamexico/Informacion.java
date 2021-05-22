package com.example.meridamexico;

import java.io.Serializable;

public class Informacion implements Serializable {

    String NombreLugar, descripcion;
    int fotos;


    public Informacion(String nombreLugar, int fotos, String descripcion) {

        NombreLugar = nombreLugar;
        this.fotos = fotos;
        this.descripcion = descripcion;
    }

    public String getNombreLugar() {
        return NombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        NombreLugar = nombreLugar;
    }

    public int getFotos() {
        return fotos;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

    public String getDescripcion() { return descripcion; }

    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
}
