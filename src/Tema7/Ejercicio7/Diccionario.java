package Tema7.Ejercicio7;

import java.util.*;

public class Diccionario {
    private String idioma;
    private Map<String, Set<String>> dic;

    public Diccionario(String idioma) {
        this.idioma = idioma;
        dic = new HashMap<>();
    }

    public void addPalabra(String palabra, String significado) {
        if (dic.containsKey(palabra)) {
            dic.get(palabra).add(significado);
        } else {
            Set<String> nuevo = new HashSet<>();
            nuevo.add(significado);
            dic.put(palabra, nuevo);
        }
    }


    public void addPalabra(String palabra, List<String> significados) {
        if (dic.containsKey(palabra)) {
            dic.get(palabra).addAll(significados);
        } else {
            Set<String> nuevo = new HashSet<>();
            nuevo.addAll(significados);
            dic.put(palabra, nuevo);

        }
    }


    public void addPalabra(String palabra, String[] significados) {
        addPalabra(palabra, Arrays.asList(significados));
    }


    public void addPalabra(String palabra, String significados, String separador) {
        String[] delimitador = significados.split(separador);
        addPalabra(palabra, delimitador);
    }

    public List<String> getSignificadosDe(String palabra) {
        List<String> listaSig = new ArrayList<>();
        Set<String> setSig = dic.get(palabra); // Obtener significados directamente

        if (setSig != null) { // Evitar NullPointerException si la palabra no existe
            listaSig.addAll(setSig); // Añadir todos los elementos del set a la lista
        }

        return listaSig;
    }


    public Set<String> getSignificadosDe1(String palabra){
        return dic.get(palabra);
    }

}