package Tema5.ejercicio12;

import Tema6.ejercicio4.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GestionPersonaDao {
    List<PErsona> listaT = new ArrayList<>();

    public void insertarPersona(PErsona p) {
        listaT.add(p);
    }

    public PErsona buscarId(String dni) {
        for (PErsona p : listaT) {
            if (p.getDni().equalsIgnoreCase(dni)) {
                System.out.println(p);
                return p;
            }
        }
        return null;
    }

    public int cantidadPers() {
        if (listaT.isEmpty()) {
            System.out.println("No hay personas");
        }

        return listaT.size();

    }

    public void mostrarArray() {
        if (listaT.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (PErsona p : listaT) {
                System.out.println(p);
            }
        }
    }

    public List<PErsona> getNPrimerasPersonas(int n){
        List<PErsona> numero = new ArrayList<>();
        Collections.sort(listaT);
        if (n <= listaT.size()){
            for (int i = 0; i <= n ; i++) {
                numero.add(listaT.get(i));
            }
        }
        return numero;
    }

    public boolean cambiarPuestoTrabajo(String dni, Trabajo tra){
        for (PErsona p : listaT){
            if (p.getDni().equalsIgnoreCase(dni)){
                p.setPuestoTrabajo(tra.getDescripcion());
                return true;
            }
        }return false;
    }

   public void ordenarDni(){
        Collections.sort(listaT);
        for (PErsona p : listaT){
            System.out.println(p);
        }
   }
}