package Tema7.Ejercicio11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Agenda {
    Map<String, Set<String>> listaT;

    public Agenda() {
        listaT = new HashMap<>();
    }

    public void insertar(String nombre){
        if (!listaT.containsKey(nombre)){
            listaT.put(nombre, new HashSet<>());
        }
    }

    public void agregarSetaContactoExistente(String nombre, String dato ){
        if(listaT.containsKey(nombre)){
            listaT.get(nombre).add(dato);
        }
    }

    public Set<String> buscarDatosContacto(String nombre){
            if (listaT.containsKey(nombre)){
                return listaT.get(nombre);
            }else {
                return new HashSet<>();
            }
    }

}
