package com.devsenior;

import java.util.HashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Usuario> usuarios = new HashMap<>();

        usuarios.put("devMaria", new Usuario("Maria", "1234"));
        usuarios.put("devPedro", new Usuario("Pedro", "abcd"));
        usuarios.put("devAna", new Usuario("Ana", "xyz"));
        usuarios.put("devLuis", new Usuario("Luis", "pass"));

       // Simulando un login
        String username = "devAna123";
        String password = "xyz123";

        if(usuarios.containsKey(username)){ // Verifica si el usuario existe
            Usuario user = usuarios.get(username); //ok, si existe entonces dame el usuario (valor).
            if(user.validarPassword(password)){ //validamos directamente con el objeto Usuario
                System.out.println("Login exitoso. Bienvenido " + user.getNombre());
            } else {
                System.out.println("Password incorrecto para el usuario " + username);
            }
        }else{
            System.out.println("Usuario " + username + " no encontrado.");
        }

        //Esto es una mala práctica.
        System.out.println("Prueba adicional:");
        Usuario user2 = usuarios.get("usernameNoExiste");
        System.out.println(user2); //null

        System.out.println(usuarios);


        System.out.println("Imprimiendo ejemplo 2 de TreeMap");
        TreeMap<String, Double> salarios = new TreeMap<>();
        salarios.put("Carlos", 2500.0);
        salarios.put("Ana", 3200.0);
        salarios.put("Beatriz", 2900.0);
        System.out.println(salarios);
    }
}