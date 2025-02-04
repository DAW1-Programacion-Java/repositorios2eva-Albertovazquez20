package Tema4.ejercicio12;

public class Menu { public static void main(String[] args) {


    Password pass1 = new Password();
    System.out.println("Contraseña generada (por defecto): " + pass1.getContraseña());
    System.out.println("Es fuerte: " + pass1.esFuerte());


    Password pass2 = new Password(12);
    System.out.println("Contraseña generada (longitud 12): " + pass2.getContraseña());
    System.out.println("Es fuerte: " + pass2.esFuerte());
}
}

