package Tema4.ejercicio13;

import java.util.ArrayList;
import java.util.Random;

public class GestionProductos {
    ArrayList<Producto> listaproductos = new ArrayList<>();

    public GestionProductos() {

        generarProducto();
    }

    private void generarProducto(){
        Random rd = new Random();
         int codigo;
         String nombre;
         String tipo;
         double precioVenta;
         double precioCompra;
         int unidades;

        for (int i = 0; i < 100; i++) {
            codigo = i+1;
            nombre = "producto" + (i+1);
            tipo = " tipo" + (rd.nextInt(5-1)+1);
            precioCompra = 5 + (100 - 5)*rd.nextDouble();
            precioVenta = precioCompra + rd.nextInt(21) + 5;
            unidades =rd.nextInt(20-1)+1;

            listaproductos.add(new Producto(codigo, nombre, tipo, precioVenta, precioCompra, unidades));
        }

    }

    public void filtrarPorPrecioVenta(double precioventa){
        for (Producto p : listaproductos){
            if (p.getPrecioVenta()>precioventa){
                System.out.println(p);
            }
        }
    }
    public void filtrarPorTipo(String tip){
        for (Producto p : listaproductos){
            if (p.getTipo().equalsIgnoreCase(tip)){
                System.out.println(p);
            }
        }
    }
    public void mostrarDiferencia(){
        for (Producto p : listaproductos){
            double diferencia = p.getPrecioVenta() - p.getPrecioCompra();
            System.out.println("Producto: " + p.getNombre());
            System.out.println("Precio de compra: " + p.getPrecioCompra() + "€");
            System.out.println("Precio de venta: " + p.getPrecioVenta() + "€");
            System.out.println("Diferencia: " + diferencia + "€");
            System.out.println("------------------------------");
        }
    }
public void mostrarProductoPosicion(int posicion){
    System.out.println(listaproductos.get(posicion).toString());
}

    public boolean cambiarPor(Producto producto, int posicion) {

        if (posicion >= 0 && posicion < listaproductos.size()) {

            listaproductos.set(posicion, producto);
            return true;
        } else {
            return false;
        }
    }

}



















