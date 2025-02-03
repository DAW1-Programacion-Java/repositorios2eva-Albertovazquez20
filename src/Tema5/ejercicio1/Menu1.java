package Tema5.ejercicio1;

import java.time.LocalDate;

public class Menu1 {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("2345677", "alberto", "vazquez", "45564456");
        Vehiculo v1 = new Vehiculo("3009mgn", "BMW", "X6", 40, true);

        VehiculoAlquilado va = new VehiculoAlquilado(v1, c1, LocalDate.now(), 5);

        System.out.println("Cliente: " + c1.getNombreCompleto());
        System.out.println("Vehículo: " + v1.getModelo());
        System.out.println("Fecha: " + va.getFechalquiler());
        System.out.println("Días: " + va.getFechalquiler());
        System.out.println("Importe total: " + va.getImporteTotal());



    }
}
