package com.devsenior;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparacionListas {
    private static final int SIZE = 100_000;

    public static void main(String[] args) {
        pruebaInsercionFinal(new ArrayList<>(), "ArrayList");
        pruebaInsercionFinal(new LinkedList<>(), "LinkedList");

        //pruea de accesos aleatorios
        pruebaAccesoAleatorio(new ArrayList<>(), "ArrayList");
        pruebaAccesoAleatorio(new LinkedList<>(), "LinkedList");
        

        //insercion al inicio
        pruebaInsercionInicio(new ArrayList<>(), "ArrayList");
        pruebaInsercionInicio(new LinkedList<>(), "LinkedList");
    }


    private static void pruebaInsercionFinal(List<Integer> list, String nombre) {
        long inicio = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
        long fin = System.nanoTime();
        System.out.println(nombre + " - Inserción al final: " + (fin - inicio)/1_000_000 + " ms");

    }
        
    private static void pruebaAccesoAleatorio(List<Integer> list, String nombre) {
        //llenar la lista primero
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }

        long inicio = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            list.get((int)(Math.random() * SIZE));
        }
        long fin = System.nanoTime();
        System.out.println(nombre + " - Acceso aleatorio: " + (fin - inicio)/1_000_000 + " ms");
    }

    private static void pruebaInsercionInicio(List<Integer> list, String nombre) {
        long inicio = System.nanoTime();
        for (int i = 0; i < SIZE; i++) {
            list.add(0, i); //sobrecarga del metodo add
        }
        long fin = System.nanoTime();
        System.out.println(nombre + " - Inserción al inicio: " + (fin - inicio)/1_000_000 + " ms");
    }
}
