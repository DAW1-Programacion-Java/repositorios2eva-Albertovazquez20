package Tema4.ejercicio7;

import Tema4.ejercicio4.DvdCine;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu7 {
    public static void main(String[] args) {
        GestionDvd gestion = new GestionDvd();
        ArrayList<String> actores1 = new ArrayList<>();
        actores1.add("Brytiago");
        actores1.add("almighty");

        DvdCine dvd1 = new DvdCine("Inception", "Christopher Nolan", "Warner Bros", actores1, "Ciencia ficción", "Un ladrón de sueños...", 148);
        DvdCine dvd2 = new DvdCine("The Matrix", "Lana Wachowski", "Warner Bros", actores1, "Acción", "Un hacker descubre la verdad...", 136);

        // con esto estamos agregando los dvds creados arriba, al array de la clase "GEstionDvd", llamado listadvds
        gestion.agregardvd(dvd1);
        gestion.agregardvd(dvd1);


        Scanner sc = new Scanner(System.in);
        int opcion;


        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Mostrar la lista de películas");
            System.out.println("2. Mostrar la pelicula que mas dura TIempo");
            System.out.println("3. Genero de peli");
            System.out.println("4. Duracion de peli");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Estas son las peliculas");
                    gestion.MostrarListaPeliculas();
                    break;
                case 2:
                    gestion.peliculaMasDuracion();
                    break;
                case 3:
                    System.out.println("Introduce una genero");
                    String pel = sc.nextLine();
                    gestion.pedirGenero(pel);
                        System.out.println("Estas son las películas con ese género:");

                break;
                case 4:
                    System.out.println("Introduce un titulo de peli");
                    String peli = sc.nextLine();
                    System.out.println("ESta es la duracion de ella");
                    gestion.duracionPeli();
                case 5:
                    System.out.println("Saliendo");
                    break;
            }
        }while( opcion !=5);
    }
}