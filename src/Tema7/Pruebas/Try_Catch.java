package Tema7.Pruebas;

import java.lang.reflect.Array;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int div , num1, num2;
        try {
        System.out.println("Introduce un numero");
        num1 = sc.nextInt();
        System.out.println("Introduce otro numero");
        num2 = sc.nextInt();

          div = num1 / num2;
            System.out.println("Resultado: " + div);
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }catch (InputMismatchException i ){
            System.out.println("Error, no se pueden introducir letras");
        }
    }
}
