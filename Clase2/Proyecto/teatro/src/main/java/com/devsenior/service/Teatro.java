package com.devsenior.service;

import com.devsenior.exceptions.AsientoInvalidoException;
import com.devsenior.exceptions.AsientoOcupadoException;
import com.devsenior.modelo.Asiento;
import com.devsenior.modelo.EstadoAsiento;

public class Teatro {
    private final int FILAS = 10;
    private final int COLUMNAS = 6;
    private Asiento[][] asientos;
    private Asiento asiento;

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

}
