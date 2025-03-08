package Tema5.ejercicio11;

public class MAin {
    public static void main(String[] args) {
        Matriz mt = new Matriz(3,3,10,1);


        mt.imprimirMatriz();

        System.out.println(mt.getMax());

        System.out.println(mt.getMed());

    }
}
