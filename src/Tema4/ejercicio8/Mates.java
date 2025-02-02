package Tema4.ejercicio8;

public class Mates {
    private static final double PI = 3.141592;


    public static double circunferencia(double radio){
        return 2 * PI * radio;

    }
    public static boolean parImpar(int num){
        if (num%2==0){
            return true;
        }
        return false;
    }
    public static boolean esPrimo(int n){
        for(int i=2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static int sumaDivisores(int num){
        int sumador = 0;
        for (int i = 1; i <= num / 2; i++) {
            if(num%i==0){
                sumador += i;
            }
        }return sumador;
    }
    public static boolean sonAmigos(int a, int b){
        int sum1, sum2;

        sum1 = Mates.sumaDivisores(a);
        sum2 = Mates.sumaDivisores(b);

        return (sum1 == b && sum2==a);
    }
}

