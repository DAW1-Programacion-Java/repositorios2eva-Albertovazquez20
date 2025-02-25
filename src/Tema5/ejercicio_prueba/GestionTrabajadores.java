package Tema5.ejercicio_prueba;

import Tema6.ejercicio4.Persona;

import java.util.*;

public class GestionTrabajadores {
    List<Trabajadores> listaT = new ArrayList<>();

    public void insertarTrabajador(Trabajadores t) {
        listaT.add(t);
    }

    public Trabajadores buscarTrabajador(int ide) {
        for (Trabajadores t : listaT) {
            if (t.getId() == ide) {
                return t;
            }
        }return null;
    }

    public Trabajadores buscarTrabajadorNombre(String nom) {
        for (Trabajadores t : listaT) {
            if (t.getNombre().equalsIgnoreCase(nom)) {
                return t;
            }
        }
        return null;
    }

    public double verSalarioTrabajador(Trabajadores tra) {
        return tra.calcularSalario();

    }

    public boolean modificarTrabajador(Trabajadores tra, String n) {
        if (tra != null) {
            tra.setNombre(n);
            return true;
        }
        return false;
    }

    public boolean modificarSueldo(Trabajadores tra, double s) {
        if (tra != null) {
            if (tra instanceof Mecanicos) {
                ((Mecanicos) tra).setSueldoBase(s);
            } else if (tra instanceof Conductores) {
                ((Conductores) tra).setSueldoBase(s);
            } else if (tra instanceof Oficinas) {
                ((Oficinas) tra).setSueldoBase(s);
                return true;
            }

        }
        return false;
    }

    public void mostrarListaTrabajadores(boolean b) {
        if (b) {
            Collections.sort(listaT);
        } else {
            Collections.sort(listaT, new Comparator<Trabajadores>() {
                @Override
                public int compare(Trabajadores o1, Trabajadores o2) {
                    return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());

                }
            });

        }
        for (Trabajadores t : listaT) {
            System.out.println(t);


        }

    }

    public boolean eliminarTrabajador(Trabajadores t){
        return listaT.remove(t);
    }

    public boolean eliminarTrabajador2(int ide){
        Iterator<Trabajadores> tr = listaT.iterator();

        while(tr.hasNext()){
            if (tr.next().getId() == ide){
                tr.remove();
                return true;
            }
        }return false;

    }



}