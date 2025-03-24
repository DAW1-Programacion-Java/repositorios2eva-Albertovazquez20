package Tema4.ejercicio12;

import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    // Constructor por defecto, longitud 8
    public Password() {
        this.longitud = 8;
        this.generarPassword();
    }

    // Constructor con longitud personalizada
    public Password(int longitud) {
        this.longitud = longitud;
        this.generarPassword();
    }


    private void generarPassword() {
        Random random = new Random();
        StringBuilder nuevaContrasena = new StringBuilder();


        for (int i = 0; i < longitud; i++) {
            int tipoCaracter = random.nextInt(3);

            if (tipoCaracter == 0) {
                nuevaContrasena.append((char) (random.nextInt(26) + 'A'));
            } else if (tipoCaracter == 1) {
                nuevaContrasena.append((char) (random.nextInt(26) + 'a'));
            } else {
                nuevaContrasena.append(random.nextInt(10));
            }
        }

        this.contrasena = nuevaContrasena.toString();
    }


    public boolean esFuerte() {
        int mayusculas = 0;
        int minusculas = 0;
        int digitos = 0;


        for (char c : contrasena.toCharArray()) {
            if (Character.isUpperCase(c)) {
                mayusculas++;
            } else if (Character.isLowerCase(c)) {
                minusculas++;
            } else if (Character.isDigit(c)) {
                digitos++;
            }
        }


        return mayusculas > 2 && minusculas > 1 && digitos > 3;
    }


    public String getContraseña() {
        return contrasena;
    }

    public int getLongitud() {
        return longitud;
    }
}


