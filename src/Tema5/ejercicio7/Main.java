package Tema5.ejercicio7;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto(1, "enlatado", LocalDate.of(2025, 5, 30), 0001));
        listaProductos.add(new Frescos(2, "Manzana", LocalDate.of(2024, 5, 20), 1002, LocalDate.of(2024, 4, 15), "España"));
        listaProductos.add(new Refrigerados(3, "Yogur", LocalDate.of(2024, 6, 10), 1003, "RF-123456"));
        listaProductos.add(new Congelados(4, "Pescado", LocalDate.of(2025, 3, 15), 1004, -18.0f));
        listaProductos.add(new Congelados(4, "Higado", LocalDate.of(2025, 3, 15), 1004, -20.0f));


        for (Producto p : listaProductos){
            if(p instanceof Frescos){
                System.out.println("Fresco = " + p);

            }else if(p instanceof Congelados){
                System.out.println("Congelado = " + p);
            }else if (p instanceof Refrigerados){
                System.out.println("Refirgerado = " + p);
            }else{
                System.out.println("Producto = " + p);
            }
        }

    }
}
