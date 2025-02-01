package Tema4.ejercicio11;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionVehiculos {
    ArrayList<VehiculoA> listaVehiculo = new ArrayList<>();


    public GestionVehiculos(){
        for (int i = 0; i < 100; i++) {
            String matricula = String.format("MAT%03d", i + 1);
            String marca = "Marca" + (i%5+1);
            String modelo = "Modelo" + (i%10+1);
            int potencia = 100 + i % 50;
            double consumo = 5 + (i % 5) * 0.5;
            double precioalquilerdia = 30. + (i%20) * 2;

            listaVehiculo.add(new VehiculoA(matricula, marca, modelo, potencia, consumo, precioalquilerdia));

        }

    }

    public ArrayList<VehiculoA> filtrarPorConsumo(double consumir){
        ArrayList<VehiculoA> listaFiltrada = new ArrayList<>();
        for (VehiculoA v : listaVehiculo){
            if(v.getConsumomedio() <= consumir){
                listaFiltrada.add(v);
            }

        }return listaFiltrada;
    }
    public void mostrarTodos(){
        for (VehiculoA v : listaVehiculo){
            System.out.println(v);
        }
    }
    public double precioMedAlquiler(){
        double preciomedio = 0;
        for (VehiculoA v : listaVehiculo){
            preciomedio += v.getPrecioalquilerdia();
        }
        return preciomedio / listaVehiculo.size();
    }
}
