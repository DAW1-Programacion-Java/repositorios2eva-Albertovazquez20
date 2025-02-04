package Tema4.ejercicio3;

public class Main {

    public static void main(String[] args) {
        Taxi taxi1 = new Taxi("ABC123", "Sur", "Diesel", 40.7128, -74.0060);  // Coordenadas de ejemplo
        Taxi taxi2 = new Taxi("XYZ789", "Norte", "Gasolina", 41.8781, -87.6298);  // Coordenadas de ejemplo

        Taxi taxi3 = new Taxi("LMN456", "Sur", "Gasolina");

        System.out.println(taxi1);
        System.out.println(taxi2);
        System.out.println(taxi3);

        if (taxi1.mismoDistrito(taxi3)) {
            System.out.println("El taxi1 y el taxi3 operan en el mismo distrito.");
        } else {
            System.out.println("El taxi1 y el taxi3 no operan en el mismo distrito.");
        }

        if (taxi2.mismoDistrito(taxi3)) {
            System.out.println("El taxi2 y el taxi3 operan en el mismo distrito.");
        } else {
            System.out.println("El taxi2 y el taxi3 no operan en el mismo distrito.");
        }
    }
}

