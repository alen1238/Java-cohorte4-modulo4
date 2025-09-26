package com.devsenior.iu;

import java.util.Scanner;


import com.devsenior.model.Estado;
import com.devsenior.model.Satelite;
import com.devsenior.service.ControlRadiacionService;

public class AppConsola {
    Scanner scanner = new Scanner(System.in);
    ControlRadiacionService controlService = new ControlRadiacionService();

    public void MostrarMenu() {
        System.out.println("=== Menú de Control de Radiación ===");
        System.out.println("1. Agregar Satélite");
        System.out.println("2. Consultar estado de un satélite");
        System.out.println("3. Agregar nueva medición");
        System.out.println("4. Consultar el historial de mediciones de un satélite");
        System.out.println("5. Cambiar estado de un satélite");
        System.out.print("Seleccione una opción: ");
    }

    public void iniciar() {
        int opcion;
        do {
            MostrarMenu();
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1:
                    System.out.println("--- Agregar Satélite ---");
                    System.out.print("Ingrese el nombre del satélite: ");
                    String nombre = scanner.nextLine();
                    Satelite satelite = new Satelite(nombre, Estado.ACTIVO);
                    controlService.registrarSatelite(satelite);
                    System.out.println("Satelite agregado exitosamente.");
                    break;
                case 2:
                    System.out.println("--- Consultar Estado de un Satélite ---");
                    System.out.print("Ingrese el ID del satélite: ");
                    String id = scanner.nextLine();
                    try {
                        Estado estado = controlService.consultarEstado(id);
                        System.out.println("El estado del satélite es: " + estado);
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // Manejo de excepción si el satélite no se encuentra
                    }
                    break;
                case 3:
                    System.out.println("--- Agregar Nueva Medición ---");
                    System.out.print("Ingrese el ID del satélite: ");
                    String satId = scanner.nextLine();
                    System.out.print("Ingrese el valor de la medición: ");
                    double medicion = Double.parseDouble(scanner.nextLine());
                    try {
                        controlService.agregarMedicion(satId, medicion);
                        System.out.println("Medición agregada exitosamente.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // Manejo de excepción si el satélite no se encuentra
                    }
                    break;
                case 4:
                    System.out.println("--- Consultar Historial de Mediciones ---");
                    System.out.print("Ingrese el ID del satélite: ");
                    String satIdHist = scanner.nextLine();
                    try {
                        System.out.println("Historial de Mediciones: " + controlService.ConsultarHistorial(satIdHist));
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // Manejo de excepción si el satélite no se encuentra
                    }
                    break;
                case 5:
                    System.out.println("--- Cambiar Estado de un Satélite ---");
                    System.out.print("Ingrese el ID del satélite: ");
                    String satIdEstado = scanner.nextLine();
                    System.out.print("Ingrese el nuevo estado (ACTIVO, INACTIVO, MANTENIMIENTO): ");
                    String nuevoEstadoStr = scanner.nextLine();
                    try {
                        Estado nuevoEstado = Estado.valueOf(nuevoEstadoStr.toUpperCase()); // Convertir la entrada a mayúsculas para evitar errores y con valueOf convierto el String a Estado
                        controlService.cambiarEstado(satIdEstado, nuevoEstado);
                        System.out.println("Estado del satélite actualizado exitosamente.");
                    } catch (IllegalArgumentException e) {
                        System.out.println("Estado inválido. Por favor ingrese ACTIVO, INACTIVO o MANTENIMIENTO.");
                    } catch (Exception e) {
                        System.out.println(e.getMessage()); // Manejo de excepción si el satélite no se encuentra
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        } while (opcion != 4);
    }
}
