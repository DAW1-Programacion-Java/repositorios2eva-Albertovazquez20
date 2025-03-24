package Tema4.ejercicio10;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Parking {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        private int plazasLibres;

    public Parking(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }

    public int getPlazasLibres() {
        return plazasLibres;
    }

    public void setPlazasLibres(int plazasLibres) {
        this.plazasLibres = plazasLibres;
    }


    public void entraVehiculo(Vehiculo vehiculo){
        if (plazasLibres > 0){
            listaVehiculos.add(vehiculo);
            plazasLibres--;

        }else {
            System.out.println("El parking esta lleno");
        }
    }
    public void salidaVehiculo(Vehiculo vehiculo){
        LocalDateTime ahora = LocalDateTime.now();
        if (listaVehiculos.contains((vehiculo))){
            long time = vehiculo.getHoraentrada().until(ahora, ChronoUnit.SECONDS);
            System.out.println("El vehículo ha estado " + time + " segundos en el parking," +
                    " el precio a pagar es " + time*0.015 + "€");
            listaVehiculos.remove(vehiculo);
            plazasLibres++;
        }else{
            System.out.println("El vehículo no está en el parking");
        }
    }
    public void mostrarVe(){
        for (Vehiculo v : listaVehiculos){
            System.out.println(v);
        }
    }

    public void plazasDispo(){
        System.out.println("Plazas disponibles : " + plazasLibres);
    }
}

