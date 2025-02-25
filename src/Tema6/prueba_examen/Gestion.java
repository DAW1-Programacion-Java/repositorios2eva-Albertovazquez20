package Tema6.prueba_examen;

import java.util.ArrayList;
import java.util.List;

public class Gestion {
    List<Trabajador> listaT = new ArrayList<>();


    public void nuevoTrabajador(Trabajador t){
        listaT.add(t);

    }

    public Trabajador buscarTrabajadorid(int ide){
    for (Trabajador t : listaT){
    if (t.getId()==ide){
        return t;
    }
    }return null;

    }
    public Trabajador buscarTrabajadorNom(String n){
        for (Trabajador t : listaT){
            if (t.getNombre().equalsIgnoreCase(n)){
                return t;
            }
        }return null;
    }

    public List<Trabajador> buscarTrabajadorClass(String tipo){
        List<Produccion> clase = new ArrayList<>();
        if (tipo.equalsIgnoreCase("Comercial")){
            clase.add(tipo);
        }
    }
}


