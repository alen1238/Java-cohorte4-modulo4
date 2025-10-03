package com.devsenior.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.devsenior.datos.DataBaseSimulada;
import com.devsenior.model.Categoria;
import com.devsenior.model.Plato;

public class PlatoService {
    
    private List<Plato> platos;

    //el constrcutor te pide que le pases una fuente de datos
    public PlatoService(List<Plato> platos) {
        this.platos = platos;
    }

    //filtrar por presupuedto y categoria
    public List<Plato> filtrarPlatos(double presupuesto, Categoria categoria) {
        return platos.stream()//aqui lo volvemos un flujo de datos
                .filter(plato -> plato.getPrecio() <= presupuesto && plato.getCategoria() == categoria)
                .sorted((p1,p2) -> Double.compare(p1.getPrecio(), p2.getPrecio())) //ordenar por precio ascendente
                .collect(Collectors.toList()); //volver a convertir el flujo en una lista
    }

    // Top 3 de los platos mas saludables
    public List<Plato> top3Saludables() {
        return platos.stream()
                .sorted((p1, p2) -> Integer.compare(p1.getCalorias(), p2.getCalorias())) //ordenar por calorias ascendente
                .limit(3) //tomar solo los primeros 3
                .collect(Collectors.toList());
    }

    //Agrupar por categoria
    public Map<Categoria, List<Plato>> agruparPorCategoria() {
        return platos.stream()
                .collect(Collectors.groupingBy(Plato::getCategoria));
    }




}
