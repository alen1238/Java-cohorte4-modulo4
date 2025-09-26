package com.devsenior.iu;

import java.util.Scanner;
import java.util.ResourceBundle.Control;

import com.devsenior.model.Satelite;
import com.devsenior.service.ControlRadiacionService;

public class AppConsola {
    Scanner scanner = new Scanner(System.in);
    ControlRadiacionService controlService = new ControlRadiacionService();

    public void MostrarMenu() {
        System.out.println("=== Menú de Control de Radiación ===");
        System.out.println("1. Agregar Satélite");
        System.out.println("2. Listar Satélites");
        System.out.println("3. Calcular Radiación Total");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");
    }

    public void iniciar() {
        int opcion;
        do {
            MostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    //pedir los datos del nuevo satelite
                    //crear el objeto satelite
                    //llamar a
                    controlService.registrarSatelite(Satelite satelite);
                    System.out.println("Satelite agregado exitosamente.");
                    break;
                case 2:
                    listarSatelites();
                    break;
                case 3:
                    calcularRadiacionTotal();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
