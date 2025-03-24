package Tema5.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Cola implements IPilaCola{
    private List<Persona> listaCola;
    Persona [] cola;
    private int llenado2 = 0;

    public Cola(){
        listaCola = new ArrayList<>();

    }

    public boolean estaVacia(){
        if(listaCola.isEmpty()){
            return true;
        }
        return false;
    }

    public Persona primero(){
        return listaCola.get(0);
    }

    public Persona extraer(){
        return listaCola.getFirst();
    }

    public void insertar(Persona p){
        listaCola.add(p);
    }

    public void mostrar(){
        for (Persona p : listaCola){
            System.out.println(p);
        }
    }
}

