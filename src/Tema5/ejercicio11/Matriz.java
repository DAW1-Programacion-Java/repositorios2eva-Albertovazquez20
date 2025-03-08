package Tema5.ejercicio11;

import java.util.Random;

public class Matriz implements Imatriz {
    Random rd = new Random();
    private int[][] matriz;


    public Matriz(int filas, int columnas, int max, int min) {
        matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = rd.nextInt(max - min + 1) + min;

            }

        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "-");
            }
            System.out.println();
        }
    }

    public int getMax() {
        int max = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                }
            }
        }
        return max;
    }

    public double getMed() {
        double suma = 0;
        int total = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma +=  matriz[i][j];
                total++;
            }

        }
        return suma / total;
    }
}
