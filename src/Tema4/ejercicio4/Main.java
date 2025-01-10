package Tema4.ejercicio4;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> actores = new ArrayList<>();
        actores.add("Leonardo DiCaprio");
        actores.add("Joseph Gordon-Levitt");
        actores.add("Elliot Page");



        DvdCine dvd = new DvdCine(
                "Origen",
                "Christopher Nolan",
                "Warner Bros",
                actores,
                "Thriller",
                "Un ladrón roba secretos del subconsciente durante el sueño.",
                148
        );

        DvdCine dvd2 = new DvdCine(
                "Origen",
                "Christopher Nolan",
                "Warner Bros",
                actores,
                "Thriller",
                "Un ladrón roba secretos del subconsciente durante el sueño.",
                148
        );
        System.out.println(dvd);
        System.out.println(dvd2);
        System.out.println(dvd.esThriller());
        System.out.println(dvd.mismaProductora(dvd2));

    }
}
