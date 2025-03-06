package Tema6.prueba_examen;

import Tema5.ejercicio7.Producto;

import java.util.*;

public class Gestion {
    List<Trabajador> listaT = new ArrayList<>();


    public void nuevoTrabajador(Trabajador t) {
        listaT.add(t);

    }

    public Trabajador buscarTrabajadorid(int ide) {
        for (Trabajador t : listaT) {
            if (t.getId() == ide) {
                return t;
            }
        }
        return null;

    }

    public Trabajador buscarTrabajadorNom(String n) {
        for (Trabajador t : listaT) {
            if (t.getNombre().equalsIgnoreCase(n)) {
                return t;
            }
        }
        return null;
    }

    public List<Trabajador> buscarTrabajadorClass(String tipo) {
        List<Trabajador> clase = new ArrayList<>();
        for (Trabajador t : listaT) {
            if (tipo.equalsIgnoreCase("Comercial") && t instanceof Comercial) {
                clase.add(t);
            } else if (tipo.equalsIgnoreCase("Producto") && t instanceof Comercial) {
                clase.add(t);
            }
        }
        return clase;
    }

    public boolean deleteWorker(int ide) {
        Iterator<Trabajador> tr = listaT.iterator();
        while (tr.hasNext()) {
            if (tr.next().getId() == ide) {
                tr.remove();
                return true;
            }
        }
        return false;
    }


    public void ordenarIde() {
        Collections.sort(listaT);
        for (Trabajador t : listaT){
            System.out.println(t);
        }

    }


    public void ordenarNombre(){
        Collections.sort(listaT, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador o1, Trabajador o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        for (Trabajador t : listaT){
            System.out.println(t);
        }
    }

}

