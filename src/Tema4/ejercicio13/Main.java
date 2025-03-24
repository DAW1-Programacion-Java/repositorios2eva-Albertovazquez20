package Tema4.ejercicio13;

import java.util.Scanner;

public class Main {    public static void main(String[] args) {
    // Crear la instancia de GestionProductos para gestionar los productos
    GestionProductos gestion = new GestionProductos();

    // Menú interactivo para el usuario
    Scanner scanner = new Scanner(System.in);
    boolean salir = false;
    int opcion;

    while (!salir) {
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Mostrar productos con precio de venta superior a un valor");
        System.out.println("2. Filtrar productos por tipo");
        System.out.println("3. Mostrar diferencia entre precio de venta y compra");
        System.out.println("4. Mostrar producto en una posición");
        System.out.println("5. Cambiar producto en una posición");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                // Filtrar productos con precio de venta superior a un valor
                System.out.print("Introduce el precio de venta mínimo: ");
                double precio = scanner.nextDouble();
                gestion.filtrarPorPrecioVenta(precio);
                break;

            case 2:
                // Filtrar productos por tipo
                System.out.print("Introduce el tipo de producto (por ejemplo, 'tipo1'): ");
                String tipo = scanner.next();
                gestion.filtrarPorTipo(tipo);
                break;

            case 3:
                // Mostrar diferencia entre precio de venta y compra
                gestion.mostrarDiferencia();
                break;

            case 4:
                // Mostrar producto en una posición
                System.out.print("Introduce la posición del producto (0-99): ");
                int posicion = scanner.nextInt();
                gestion.mostrarProductoPosicion(posicion);
                break;

            case 5:
                // Cambiar producto en una posición
                System.out.print("Introduce la posición del producto a cambiar: ");
                int pos = scanner.nextInt();
                System.out.print("Introduce el nuevo código del producto: ");
                int codigo = scanner.nextInt();
                System.out.print("Introduce el nuevo nombre del producto: ");
                String nombre = scanner.next();
                System.out.print("Introduce el nuevo tipo del producto: ");
                String tipoProducto = scanner.next();
                System.out.print("Introduce el nuevo precio de venta: ");
                double precioVenta = scanner.nextDouble();
                System.out.print("Introduce el nuevo precio de compra: ");
                double precioCompra = scanner.nextDouble();
                System.out.print("Introduce las unidades disponibles: ");
                int unidades = scanner.nextInt();

                Producto nuevoProducto = new Producto(codigo, nombre, tipoProducto, precioVenta, precioCompra, unidades);
                boolean cambioExitoso = gestion.cambiarPor(nuevoProducto, pos);
                if (cambioExitoso) {
                    System.out.println("Producto cambiado con éxito.");
                } else {
                    System.out.println("No se pudo cambiar el producto. Posición inválida.");
                }
                break;

            case 6:
                // Salir
                System.out.println("¡Hasta luego!");
                salir = true;
                break;

            default:
                System.out.println("Opción no válida, por favor elige otra.");
                break;
        }
    }

    scanner.close();
}
}

