package Tema5.ejercicio6;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("1111AAA", "Toyota", "Corolla", 50.0, true));
        vehiculos.add(new Turismo("2222BBB", "Ford", "Focus", 60.0, true, 5, false));
        vehiculos.add(new Furgoneta("3333CCC", "Mercedes", "Sprinter", 80.0, true, 3000, 1000));

        for (Vehiculo v : vehiculos){
           if(v instanceof Turismo){
               System.out.println("Turismo = " + v);

           } else if (v instanceof Furgoneta){
               System.out.println("Furgoneta = "+ v);
           }else {
               System.out.println("Vehiculo = " + v);
           }

        }

    }

}