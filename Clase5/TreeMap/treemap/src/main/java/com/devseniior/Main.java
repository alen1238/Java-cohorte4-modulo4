package com.devseniior;

import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        

        //Cómo imprimir de forma descendente los puntajes en el formato: nombre - puntaje?
        TreeMap<Integer, String> puntajes = new TreeMap<>();
        puntajes.put(1, "Juan");
        puntajes.put(15, "Ana");
        puntajes.put(20, "Luis");
        puntajes.put(35, "Maria");
        puntajes.put(400, "Carlos");

        System.out.println(puntajes.size());

        for(int i = puntajes.size()*10; i > 0; i-=10){
            System.out.println(puntajes.get(i));
        }


    }
}