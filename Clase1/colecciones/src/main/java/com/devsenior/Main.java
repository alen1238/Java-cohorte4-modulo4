package com.devsenior;

public class Main {
    public static void main(String[] args) {
        metodo3();
    
    }

    public static void metodo1() {
        int id1 = 12;
        int id2 = 34;
        int id3 = 45;
        int id4 = 67;
        int id5 = 89;

        int[] ids = {12,34,45,67,89,67,43};//especificación y creación del arreglo
        
        
        int numero = ids[4]; //lectura del arreglo

        System.out.println(ids.length);
        System.out.println(ids[ids.length - 1]);
        System.out.println(ids[5]); //lectura del arreglo
        ids[5] = 100; //modificacion del arreglo, o escritura
        System.out.println(ids[5]);

        // 1. Declaración de un array de enteros
        int[] numeros;
    
        //2. Inicialización del array 
        numeros = new int[5];
    }

    public static int SumarNumeros(int[] numeros) {
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i]; //lectura del arreglo
        }
        return suma;
    }

    public static void metodo3(){
       
        
        double[][] notasEstudiantes = {
            {4.5, 3.2, 5.0, 4.8}, //zona sur
            {3.5, 2.2}, //zona norte
            {2.5, 4.2, 3.0, 4.8}, //zona oriente
            {4.5, 3.2, 5.0, 4.8, 5.0}, //zona occidente
            {3.5, 2.2, 4.0} // zona centro
        };

        for(int i = 0; i < notasEstudiantes.length; i++){
            for(int j = 0; j < notasEstudiantes[i].length; j++){
               System.out.print(notasEstudiantes[i][j] + " ");
            }    
            System.out.println();
        }
    }

}