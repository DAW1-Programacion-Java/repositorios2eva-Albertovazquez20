package Tema5.ejercicio8;

import java.util.ArrayList;
import Tema5.ejercicio7.Congelados;
import Tema5.ejercicio7.Refrigerados;
import Tema5.ejercicio7.Frescos;
import Tema5.ejercicio7.Producto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class MAin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColeccionProductos gestion = new ColeccionProductos();


        gestion.agregarProducto(new Frescos(1, "Manzana", LocalDate.of(2024, 3, 15), 101, LocalDate.of(2024, 3, 1), "España"));
        gestion.agregarProducto(new Congelados(2, "Pescado congelado", LocalDate.of(2025, 6, 15), 102, -18.0f));
        gestion.agregarProducto(new Refrigerados(3, "Yogur", LocalDate.of(2024, 4, 20), 103, "A123"));

        int num;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Modificar temperatura de congelación");
            System.out.println("2. Consultar productos frescos por país");
            System.out.println("3. Consultar productos caducados");
            System.out.println("4. Obtener productos por tipo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            num = sc.nextInt();
            sc.nextLine(); // Consumir salto de línea

            switch (num) {
                case 1:
                    System.out.println("Introduce un id de producto");
                    int ide = sc.nextInt();
                    System.out.println("INtroduce la nueva temperatura de congelacion");
                    float temp = sc.nextFloat();
                    boolean funcion = gestion.modificarTemperaturaCongelacion(ide, temp);
                    if (funcion){
                        System.out.println("Temperatura modificada correctamente");
                    }else {
                        System.out.println("Error");
                    }
                    break;
                case 2:
                    System.out.println("Introduce un pais para ver sus producos frescos ");
                    String pa = sc.next();
                    ArrayList<Frescos> frescos = gestion.consultarProductosPorPaisOrigen(pa);
                    if (frescos.isEmpty()) {
                        System.out.println("No hay productos frescos de " + pa);
                    } else {
                        System.out.println("Productos frescos de " + pa + ":");
                    for (Producto p : frescos){
                        System.out.println(p);
                    }
                    }
                    break;
                case 3:
                    System.out.println("Estos son los productos caducados");
                    ArrayList<Producto> caducado = gestion.consultarProductosCaducados();
                    if(caducado.isEmpty()){
                        System.out.println("No hay productos caducados");
                    }else{
                        System.out.println("Estos son los productos caducados");
                        for (Producto p : caducado){
                            System.out.println(p);
                        }
                    }
                case 4:
                    System.out.println("Escriba un tipo de producto");
                    String tip = sc.next();
                    ArrayList<Producto> tipoProducto = gestion.obtenerProductosDelTipo(tip);
                    if (tipoProducto.isEmpty()){
                        System.out.println("No hay ese tipo");
                    }else {
                        System.out.println("Estos son los productos de ese tipo");
                        for (Producto p : tipoProducto){
                            System.out.println(p);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Error de numero");

                sc.close();
            }
        }while(num !=5);


    }
}
