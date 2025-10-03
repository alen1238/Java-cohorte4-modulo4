package com.devsenior.model;

public class Plato {
    private String nombre;
    private double precio;
    private int calorias;
    private Categoria categoria;
    private Stand stand;

    public int getCalorias() {
        return calorias;
    }
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }
    public Plato(String nombre, double precio, int calorias, Categoria categoria, Stand stand) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
        this.stand = stand;
        this.calorias = calorias;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Stand getStand() {
        return stand;
    }
    public void setStand(Stand stand) {
        this.stand = stand;
    }
    @Override
    public String toString() {
        return "Plato{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", categoria=" + categoria +
                ", calorias=" + calorias +
                ", stand=" + stand +
                '}';
    }   
}
