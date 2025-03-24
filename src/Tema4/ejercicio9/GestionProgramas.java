package Tema4.ejercicio9;

import java.util.ArrayList;

public class GestionProgramas {
        ArrayList<Programa> listaProgramas = new ArrayList<>();

        public void InsertarPrograma(Programa p){
            listaProgramas.add(p);
        }
        public void ListaSoftwares(){
            for (Programa p : listaProgramas){
                System.out.println(p);
            }
        }
        public void FiltrarLicencia(String licencia){
            for (Programa p : listaProgramas){
                if(p.getTipolicencia().equalsIgnoreCase(licencia)){
                    System.out.println(p);
                }
            }
        }
        public void Ffuncion(String funcion){
            for (Programa p : listaProgramas){
                if (p.getFuncion().equalsIgnoreCase(funcion)) {
                    System.out.println(p);
                }
            }
        }
        public void Eliminar(){
            if(!listaProgramas.isEmpty()){
                listaProgramas.remove(listaProgramas.size() - 1);
            }
        }
        public Programa Buscarprograma(String program){
            for (Programa p : listaProgramas){
                if (p.getNombre().equalsIgnoreCase(program)) {
                    return p;
                }
            }return null;
        }


}
