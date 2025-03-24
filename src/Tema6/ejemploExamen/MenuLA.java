package Tema6.ejemploExamen;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class MenuLA {
    public static void main(String[] args) {

        Lavadora l1 = new Lavadora("bosh", 4.0, 5, true);
        Lavadora l2 = new Lavadora("bosh", 6.0, 10, false);


        System.out.println(l1.getConsumoLavadora(4));

        System.out.println(l1.getCosteConsumoLava(2, 4.00));
    }
}