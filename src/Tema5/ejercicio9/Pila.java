package Tema5.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Pila implements IPilaCola{

    private List<Persona> listaPilas;
    Persona [] pila;
    private int llenado = 0;

        public Pila(){
            listaPilas = new ArrayList<>();

        }

    public boolean estaVacia(){
        return listaPilas.isEmpty();
    }

    public Persona primero(){
            return listaPilas.get(0);
    }

    public Persona extraer(){
            return listaPilas.getLast();
    }

    public void insertar(Persona p){
            listaPilas.add(p);
    }

    public void mostrar(){
            for (Persona p : listaPilas){
                System.out.println(p);
            }
    }
}
