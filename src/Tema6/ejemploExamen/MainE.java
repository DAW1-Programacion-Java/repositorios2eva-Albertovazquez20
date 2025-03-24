package Tema6.ejemploExamen;

import java.util.ArrayList;

public class MainE {
    public static void main(String[] args) {

        ArrayList<Electrodomestico> lista = new ArrayList<>();
        lista.add(new Electrodomestico("nevera", "Bosh", 2.0));
        lista.add(new Electrodomestico("frigorifico", "Bosh", 4.0));
        lista.add(new Lavadora("Bosh", 2, 20, true));


        for (Electrodomestico e : lista){
            System.out.println(e);
            System.out.println(e.getConsumo(5) + " ESte es su consumo en esas horas");
            System.out.println(e.getCosteConsumo(5, 2.00) + " Este es el coste de el total de las horas");
            System.out.println("------------------------------------------------");
        }


    }

}
