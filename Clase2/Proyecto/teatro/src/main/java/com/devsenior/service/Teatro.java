package com.devsenior.service;

import com.devsenior.exceptions.AsientoInvalidoException;
import com.devsenior.exceptions.AsientoLibreException;
import com.devsenior.exceptions.AsientoOcupadoException;
import com.devsenior.modelo.Asiento;
import com.devsenior.modelo.EstadoAsiento;

public class Teatro {
    private final int FILAS = 10;
    private final int COLUMNAS = 6;
    private Asiento[][] asientos;

    public Teatro() {
        asientos = new Asiento[FILAS][COLUMNAS];
        inicializarAsientos();
    }

    private void inicializarAsientos() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                asientos[i][j] = new Asiento();
            }
        }
    }

    public EstadoAsiento[][] obtenerEstadoAsientos() {
        EstadoAsiento[][] estadoAsientos = new EstadoAsiento[FILAS][COLUMNAS];
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                estadoAsientos[i][j] = asientos[i][j].getEstado();
            }
        }
        return estadoAsientos;
    }

    public boolean reservarAsiento(int fila, int columna) throws AsientoInvalidoException, AsientoOcupadoException {
        if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
            throw new AsientoInvalidoException("Fila o columna fuera de rango");
        }
        if (asientos[fila][columna].isLibre()) {
            asientos[fila][columna].setEstado(EstadoAsiento.OCUPADO);
            return true;
        } else {
            throw new AsientoOcupadoException("El asiento ya está reservado");
        }
    }

    public boolean cancelarReserva(int fila, int columna)
            throws AsientoInvalidoException, AsientoLibreException {
        if (fila < 0 || fila >= FILAS || columna < 0 || columna >= COLUMNAS) {
            throw new AsientoInvalidoException("Fila o columna fuera de rango");
        }
        if (!asientos[fila][columna].isLibre()) {
            asientos[fila][columna].setEstado(EstadoAsiento.LIBRE);
            return true;
        } else {
            throw new AsientoLibreException("El asiento ya está libre");
        }
    }

    public String obtenerEstadisticas() {
        int libres = 0, ocupados = 0;
        int total = FILAS * COLUMNAS;

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (asientos[i][j].isLibre()) {
                    libres++;
                } else {
                    ocupados++;
                }
            }
        }

        double porcentaje = (ocupados * 100.0) / total;
        return "Asientos libres: " + libres +
               ", Asientos ocupados: " + ocupados +
               ", Ocupación: " + String.format("%.2f", porcentaje) + "%";
    }

    public int getFilas() {
        return FILAS;
    }

    public int getColumnas() {
        return COLUMNAS;
    }
}


