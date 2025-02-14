package Tema5.ejercicio7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto());
        listaProductos.add(new Frescos());
        listaProductos.add(new Refrigerados());
        listaProductos.add(new Congelados());
    }
}
