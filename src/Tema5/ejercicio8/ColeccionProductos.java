package Tema5.ejercicio8;

import Tema5.ejercicio7.Congelados;
import Tema5.ejercicio7.Refrigerados;
import Tema5.ejercicio7.Frescos;
import Tema5.ejercicio7.Producto;

import java.time.LocalDate;
import java.util.ArrayList;

public class ColeccionProductos {
    private ArrayList<Producto> listaProductos;

    public ColeccionProductos() {
        listaProductos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public boolean modificarTemperaturaCongelacion(int ide, float temcongela){
        for (Producto p : listaProductos){
            if (p.getId() == ide && p instanceof Congelados){
                ((Congelados) p).setTemperaturacongelacion(temcongela);
                return true;
            }
        }return false;
    }

    public ArrayList<Frescos> consultarProductosPorPaisOrigen(String p){
        ArrayList<Frescos> productosPorPais = new ArrayList<>();
        for (Producto pa : listaProductos){
            if ( pa instanceof Frescos && ((Frescos) pa).getPais().equalsIgnoreCase(p)){
                productosPorPais.add((Frescos) pa);
            }
        } return productosPorPais;
    }

    public ArrayList<Producto> consultarProductosCaducados(){
        ArrayList<Producto> productosFecha = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        for (Producto p : listaProductos){
            if (p.getFechacaducidad().isBefore(fechaActual));
            productosFecha.add(p);
        }
        return productosFecha;
    }

    public ArrayList<Producto> obtenerProductosDelTipo(String tipo){
        ArrayList<Producto> productosDelTipo = new ArrayList<>();
        for (Producto p : listaProductos){
            if (tipo.equalsIgnoreCase("Fresco") && p instanceof Frescos){
                productosDelTipo.add(p);
            }
            if(tipo.equalsIgnoreCase("Congelado") && p instanceof Congelados){
                productosDelTipo.add(p);
            }
            if(tipo.equalsIgnoreCase("Refrigerado") && p instanceof Refrigerados) {
                productosDelTipo.add(p);
            }
        }
        return productosDelTipo;
    }

}











