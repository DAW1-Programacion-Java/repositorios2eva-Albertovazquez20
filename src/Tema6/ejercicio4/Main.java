package Tema6.ejercicio4;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Persona> listaT = new ArrayList<>();

        listaT.add(new Persona(1, "Alberto", LocalDate.of(2000, 5, 4)));
        listaT.add(new Persona(2, "Kiko", LocalDate.of(2020, 8, 14)));
        listaT.add(new Persona(3, "Andres", LocalDate.of(2010, 2, 24)));

        for (Persona p : listaT){
            System.out.println(p);
        }
        Collections.sort(listaT);

        for (Persona p : listaT){
            System.out.println(p);
        }

        Collections.sort(listaT, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });

    }
}