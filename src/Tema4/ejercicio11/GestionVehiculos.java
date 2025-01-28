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
            Double precioalquilerdia = 30. + (i%20) * 2;

            listaVehiculo.add(new VehiculoA(matricula, marca, modelo, potencia, consumo, precioalquilerdia));

        }

    }
    public void filtrarPorConsumo(double consumir){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un consumo");
        double num = sc.nextDouble();
        for (VehiculoA v : listaVehiculo){
            if(v.getConsumomedio() <= num){
                System.out.println(v);
            }

        }
    }
}
