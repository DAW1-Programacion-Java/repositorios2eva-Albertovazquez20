package Tema4.ejercicio5;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(12345, "Juan", "Pérez",
                LocalDate.of(2000, 5, 15), "1º DAW", 8.5, 9.0);
        Alumno alumno2 = new Alumno(12346, "María", "López",
                LocalDate.of(1999, 8, 20), "2º DAW", 7.8, 6.5);

        System.out.println(alumno1.toString());
        System.out.println(" la media de las notas es " + alumno1.MediaNotas());
    }
}
