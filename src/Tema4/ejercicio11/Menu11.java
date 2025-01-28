package Tema4.ejercicio11;

import java.util.ArrayList;

public class Menu11 {
    public static void main(String[] args) {
        GestionVehiculos gv = new GestionVehiculos();
        System.out.println("Precio medio de alquiler: " + gv.precioMedAlquiler());
        ArrayList<VehiculoA> lista_consumo = gv.filtrarPorConsumo(6.5);

        for (VehiculoA v : lista_consumo) {
            System.out.println(v);
        }
        System.out.println("Esrtos son todos los vehiculos");
        gv.mostrarTodos();

    }
}
