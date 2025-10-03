package com.devsenior.model;

public class Stand {
    private String nombre;

    public Stand(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Stand{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
