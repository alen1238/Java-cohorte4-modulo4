package com.devsenior.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.devsenior.excepciones.SateliteNoEncontradoException;
import com.devsenior.model.Estado;
import com.devsenior.model.Satelite;

public class ControlRadiacionService {

    private Map<String, Satelite> satelites;

    public ControlRadiacionService(){
        satelites = new HashMap<>();
    }

    public void registrarSatelite(Satelite satelite){
        satelites.put(satelite.getId(), satelite);
    }

    //Consultar Estado
    public Estado consultarEstado(String id) throws SateliteNoEncontradoException{
        Satelite satelite = satelites.get(id);
        if(satelite != null){
            return satelite.getEstado();//rompe el método aquí porque el return garantiza la salida del método
        }
        throw new SateliteNoEncontradoException("Satélite no encontrado");
    }


    public List<Double> ConsultarHistorial(String id) throws SateliteNoEncontradoException{
        Satelite satelite = satelites.get(id); //la busqueda del satelite en el mapa.
        if(satelite != null){
            return satelite.getMediciones();
        }
        throw new SateliteNoEncontradoException("Satélite no encontrado");
    }

    public boolean agregarMedicion(String id, double medicion) throws SateliteNoEncontradoException{
        Satelite satelite = satelites.get(id);
        if(satelite != null){
            satelite.agregarMedicion(medicion);
            return true;
        }
        //si no existe el satelite, no hago nada.
        throw new SateliteNoEncontradoException("Satélite no encontrado");
    }

    public void cambiarEstado(String id, Estado nuevoEstado) throws SateliteNoEncontradoException{
            buscarSatelite(id).setEstado(nuevoEstado);
    }

    private Satelite buscarSatelite(String id) throws SateliteNoEncontradoException{
        Satelite satelite = satelites.get(id);
        if(satelite != null){
            return satelite;
        }
        throw new SateliteNoEncontradoException("Satélite no encontrado");
    }

}
