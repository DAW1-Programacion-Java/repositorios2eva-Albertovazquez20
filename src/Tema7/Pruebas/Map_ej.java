package Tema7.Pruebas;

import java.util.HashMap;
import java.util.Map;

public class Map_ej {
    public static void main(String[] args) {
        Map<String, String> datos = new HashMap<>();

        datos.put("10", "Alberto");
        datos.put("20", "kiko");
        

        for (String d : datos.keySet()){
            String valor = datos.get(d);
            System.out.println("Clave: " + d + ", Valor: " + valor);



        }
    }
}
