package Tema6.prueba_examen;

import Tema5.ejercicio_prueba.Trabajadores;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Trabajador t1 = new Comercial(1, "ALberto", LocalDate.of(2005, 3, 20), 20, 200);

        Trabajador t2 = new Produccion(2, "Kiko", LocalDate.of(2002, 2, 11), "Comandante", 600);

        Gestion gt = new Gestion();

        gt.nuevoTrabajador(t1);
        gt.nuevoTrabajador(t2);

        System.out.println(gt.buscarTrabajadorid(1));
        System.out.println(gt.buscarTrabajadorNom("Alberto"));
        System.out.println(gt.buscarTrabajadorClass("Comercial"));
        System.out.println(gt.buscarTrabajadorClass("Produccion"));
        System.out.println(gt.deleteWorker(1));

        gt.ordenarIde();

        gt.ordenarNombre();




    }
}
