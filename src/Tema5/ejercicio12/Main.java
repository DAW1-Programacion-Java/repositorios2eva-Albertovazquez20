package Tema5.ejercicio12;

import Tema6.ejercicio4.Persona;

public class Main {
    public static void main(String[] args) {
        PErsona p1 = new PErsona("345rty", "carter records", "disquera");
        PErsona p2 = new PErsona("667juy", "lerulginius", "compositor");
        Trabajo t1 =  new Trabajo(1, "contratar artistas", 2000);

        GestionPersonaDao gs = new GestionPersonaDao();
        gs.insertarPersona(p1);


        System.out.println(gs.buscarId("345rty"));
        System.out.println(gs.cantidadPers());

        gs.mostrarArray();
        System.out.println(gs.getNPrimerasPersonas(1));



        if(gs.cambiarPuestoTrabajo("345rty", t1)){
            System.out.println("succesfull");

        }else {
            System.out.println("error");
        }

        gs.ordenarDni();
    }
}
