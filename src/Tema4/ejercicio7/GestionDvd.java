package Tema4.ejercicio7;

import Tema4.ejercicio4.DvdCine;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionDvd {
    ArrayList<DvdCine> listadvds;

    public GestionDvd() {
        this.listadvds = new ArrayList<>();
    }
    //aEsto se crea para que cuando en la clase "DvdCine" se cree un dvd, aqui se almacena el dvd creado
    public void agregardvd(DvdCine dvds){
        listadvds.add(dvds);
    }
    public void MostrarListaPeliculas(){
        for (DvdCine d : listadvds){
            System.out.println(d.getTitulo());
            System.out.println(d.getProductora());
        }
    }
    public void peliculaMasDuracion(){
        if (listadvds.isEmpty()) {  // Evitar error si la lista está vacía
            System.out.println("No hay películas en la lista.");
            return;
        }
        DvdCine mas = listadvds.get(0);
        for (DvdCine d : listadvds){
            if(d.getDuracion() > mas.getDuracion()){
                mas = d;
            }
        }
        System.out.println("La película con mayor duración es: " + mas.getTitulo() + " con " + mas.getDuracion() + " minutos.");
    }
    public void pedirGenero(String genero){
        for (DvdCine d: listadvds){
            if (d.getGenero().equalsIgnoreCase(genero)){
                System.out.println(d.getTitulo());
            }
        }
    }
    public void duracionPeli(){
        Scanner sc = new Scanner(System.in);
        String titu = sc.nextLine();

        for (DvdCine d : listadvds){
            if(d.getTitulo().equalsIgnoreCase(titu)){
                System.out.println(d.getDuracion());
            }
        }
        System.out.println("No se encontró la película con el título: " + titu);
    }


}