package com.devsenior.ui;

import com.devsenior.exceptions.AsientoInvalidoException;
import com.devsenior.exceptions.AsientoLibreException;
import com.devsenior.exceptions.AsientoOcupadoException;
import com.devsenior.modelo.EstadoAsiento;
import com.devsenior.service.Teatro;

import java.util.Scanner;

public class Menu {
    private Teatro teatro;
    private Scanner scanner;

    public Menu() {
        this.teatro = new Teatro();
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMenu() {
        int opcion = -1;
        do {
            System.out.println("=== Sistema de Reservas ===");
            System.out.println("1. Mostrar mapa de asientos");
            System.out.println("2. Reservar asiento");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Consultar estadísticas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> mostrarMapa();
                case 2 -> reservar();
                case 3 -> cancelar();
                case 4 -> mostrarEstadisticas();
                case 5 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 5);
    }

    private void mostrarMapa() {
        // TODO: obtener el estado de los asientos desde el servicio
        // TODO: imprimir una matriz en consola
        // Ejemplo: L = Libre, O = Ocupado
    }

    private void reservar() {
        // TODO: pedir fila y columna al usuario
        // TODO: llamar a teatro.reservarAsiento
        // TODO: manejar excepciones AsientoInvalidoException y AsientoOcupadoException
    }

    private void cancelar() {
        // TODO: pedir fila y columna al usuario
        // TODO: llamar a teatro.cancelarReserva
        // TODO: manejar excepciones AsientoInvalidoException y AsientoLibreException
    }

    private void mostrarEstadisticas() {
        // TODO: llamar al método obtenerEstadisticas del servicio y mostrarlo en consola
    }
}
