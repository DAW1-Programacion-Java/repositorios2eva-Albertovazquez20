package Tema5.ejercicio10;

import java.util.Random;

public class GestionNumeros implements Inumeros {

    private int[] numeros;

    public GestionNumeros() {
        numeros = new int[10];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;

        }
    }

    @Override
    public void mostrarNumeros() {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    public void mostrarNumerosComoString() {
        System.out.print("[");

        for (int i = 0; i < numeros.length; i++) {
            if (i < numeros.length - 1) {
                System.out.print(numeros[i] + ",");
            } else {
                System.out.print(numeros[i]);
            }
        }
        System.out.println("]");
    }

    public void multiplicarPor(int num) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = numeros[i] * num;
        }
    }

    public int contarValoresMayoresQue(int n) {
        int count = 0;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > n) {
                count++;
            }
        }
        return count;
    }

    public int contarValoresEntre(int num1, int num2) {
        int cont = 0;
        int min = Math.min(num1, num2);
        int max = Math.max(num1, num2);

        for (int i = min; i <= max; i++) {
            cont++;
        }

        return cont;
    }

    public int compararCon(int[] otroArray) {
        int suma = 0;
        if (numeros.length >= otroArray.length) {
            for (int i = 0; i < numeros.length; i++) {
                suma += numeros[i];
            }
        } else {
            for (int i = 0; i < otroArray.length; i++) {
                suma += otroArray[i];
            }
        }
        return suma;
    }

    public int[] getArray(int[] otroArray) {
        if (numeros.length >= otroArray.length) {
            return numeros;
        } else {
            return otroArray;
        }
    }

}












