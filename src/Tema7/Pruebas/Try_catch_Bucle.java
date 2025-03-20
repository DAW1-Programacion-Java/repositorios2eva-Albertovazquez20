package Tema7.Pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_catch_Bucle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div, num1 = 0, num2 = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Introduce un numero");
                num1 = sc.nextInt();
                entradaValida = true;
            }catch (Exception e ){
                System.out.println("Error, introduce un numero valido");
                sc.nextLine();
            }
        }
        entradaValida = false;
        while(true){
            try{
                System.out.println("Introduce el segundo numero");
                num2 = sc.nextInt();

                if (num2 == 0){
                    System.out.println("Error, no se puede dividir por 0");

                }else{
                    break;
                }

            }catch (Exception e ){
                System.out.println("Error, introduce un numero valido");
                sc.nextLine();
            }

        }
        div = num1 / num2;
        System.out.println(div);
    }
}

