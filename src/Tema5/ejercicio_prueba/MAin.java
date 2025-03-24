package Tema5.ejercicio_prueba;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class MAin {
    public static void main(String[] args) {
        Conductores conductor1 = new Conductores(1, "Juan Perez", LocalDate.of(1980, 5, 15), "B", LocalDate.of(2025, 5, 15), 1500.0, 1000.0);
        Conductores conductor2 = new Conductores(2, "Maria Lopez", LocalDate.of(1985, 8, 20), "C", LocalDate.of(2023, 8, 20), 1600.0, 1200.0);
        Conductores conductor3 = new Conductores(3, "Carlos Sanchez", LocalDate.of(1990, 3, 10), "D", LocalDate.of(2024, 3, 10), 1700.0, 1100.0);
        Conductores conductor4 = new Conductores(4, "Ana Martinez", LocalDate.of(1992, 7, 25), "E", LocalDate.of(2026, 7, 25), 1800.0, 1300.0);
        Conductores conductor5 = new Conductores(5, "Luis Gomez", LocalDate.of(1988, 12, 5), "B", LocalDate.of(2022, 12, 5), 1400.0, 900.0);

        Mecanicos mecanico1 = new Mecanicos(6, "Pedro Rodriguez", LocalDate.of(1975, 10, 30), LocalDate.of(2000, 10, 30), Categoria.JEFE_TALLER, 2000.0);
        Mecanicos mecanico2 = new Mecanicos(7, "Rosa Garcia", LocalDate.of(1980, 4, 15), LocalDate.of(2005, 4, 15), Categoria.OFICIAL, 1800.0);

        Oficinas oficina1 = new Oficinas(8, "Sara Perez", LocalDate.of(1995, 6, 20), "Completa", 1200.0);
        Oficinas oficina2 = new Oficinas(9, "Manuel Lopez", LocalDate.of(1998, 9, 10), "Parcial", 1000.0);

        GestionTrabajadores gt = new GestionTrabajadores();


        gt.insertarTrabajador(conductor1);
        gt.insertarTrabajador(conductor2);
        gt.insertarTrabajador(conductor3);
        gt.insertarTrabajador(conductor4);
        gt.insertarTrabajador(conductor5);
        gt.insertarTrabajador(mecanico1);
        gt.insertarTrabajador(mecanico2);
        gt.insertarTrabajador(oficina1);
        gt.insertarTrabajador(oficina2);


        System.out.println(gt.buscarTrabajador(1));
        System.out.println(gt.buscarTrabajadorNombre("Maria Lopez"));

        System.out.println(gt.verSalarioTrabajador(conductor1));

        System.out.println(gt.modificarTrabajador(oficina1, "Sara Vazquez"));
        System.out.println(gt.modificarSueldo(conductor2, 1250));


      gt.mostrarListaTrabajadores(true);
      gt.mostrarListaTrabajadores(false);


      boolean delete = gt.eliminarTrabajador(conductor3);
        boolean deleteid = gt.eliminarTrabajador2(5);


        gt.mostrarListaTrabajadores(true);

    }
}
