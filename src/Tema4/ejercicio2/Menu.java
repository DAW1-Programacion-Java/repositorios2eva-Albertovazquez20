package Tema4.ejercicio2;

public class Menu {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Juan", "Pérez", 1500);
        Empleado empleado2 = new Empleado(2, "Ana", "López", 1800);


        System.out.println("Empleado 1: " + empleado1);
        System.out.println("Empleado 2: " + empleado2);

        empleado1.incrementaSalario(10);  // Aumentar un 10% en salario
        empleado2.incrementaSalario(5);   // Aumentar un 5% en salario

        System.out.println("Empleado 1 después de aumento: " + empleado1);
        System.out.println("Empleado 2 después de aumento: " + empleado2);

        System.out.println("Salario anual de empleado 1: " + empleado1.getSalarioAnual() + "€");
        System.out.println("Salario anual de empleado 2: " + empleado2.getSalarioAnual() + "€");

        System.out.println("Nombre completo de empleado 1: " + empleado1.getNombreCompleto());
        System.out.println("Nombre completo de empleado 2: " + empleado2.getNombreCompleto());
    }
}
