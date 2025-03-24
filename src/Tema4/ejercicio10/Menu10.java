package Tema4.ejercicio10;

public class Menu10 {
    public static void main(String[] args) {
        Parking parking = new Parking(2);
        Vehiculo vehiculo1 = new Vehiculo("2039ABC");
        Vehiculo vehiculo2 = new Vehiculo("2455GHF");

        parking.entraVehiculo(vehiculo1);
        parking.entraVehiculo(vehiculo2);

        parking.mostrarVe();
        parking.plazasDispo();

        parking.salidaVehiculo(vehiculo1);
        parking.salidaVehiculo(vehiculo2);

        parking.mostrarVe();
        parking.plazasDispo();

    }
}
