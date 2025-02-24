package Tema5.ejercicio_prueba;

import java.util.ArrayList;
import java.util.List;

public class GestionTrabajadores {
List<Trabajadores> listaT = new ArrayList<>();

    public void insertarTrabajador(Trabajadores t){
    listaT.add(t);
    }

    public void buscarTrabajador(int ide){
        for (Trabajadores t : listaT){
            if (t.getId() == ide){
                System.out.println(t);
            }
        }
    }

    public void buscarTrabajadorNombre(String nom){
        for (Trabajadores t : listaT){
            if (t.getNombre().equalsIgnoreCase(nom)){
                System.out.println(t);
            }
        }
    }

    public double verSalarioTrabajador(Trabajadores tra){
        return tra.calcularSalario();

        }

        public boolean modificarTrabajador(Trabajadores tra, String n){
        if (tra != null){
            tra.setNombre(n);
            return true;
        }
            return false;
    }

    public boolean modificarSueldo(Trabajadores tra, double s){
        if (tra != null){
            if (tra instanceof Mecanicos){
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


}
