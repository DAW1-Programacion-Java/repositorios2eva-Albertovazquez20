package Tema7.Pruebas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Integer_ej {
    public static void main(String[] args) {
        List<Integer> listaS = Arrays.asList(21, 30, 10, 47, 50);

        for (Integer i : listaS){
            System.out.println(i);
        }
        System.out.println("");

        for (Integer i : listaS){

            if (i%2==0){
                System.out.println(i);
            }
        }
        System.out.println(" ");
        int sum = 0;
        for (Integer i : listaS){
            sum += i;
        }
        System.out.println(sum);

    }
}