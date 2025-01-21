package tema4.ejercicios1_6;

import Tema4.ejercicio6.Alumnos;
import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Scanner;


public class GestionAlumnos {

    private Alumnos [] alumnos;

    public void llenarArray() {
        alumnos = new Alumnos[10];


        // Asignar los objetos de alumnos a los índices del array
        alumnos[0] = new Alumnos(2, "Ana", "González", LocalDate.of(2002, 8, 15), "DAW", 6.0, 7.2);
        alumnos[1] = new Alumnos(3, "Juan", "Martínez", LocalDate.of(2004, 1, 22), "DAM", 8.3, 9.1);
        alumnos[2] = new Alumnos(4, "Laura", "Rodríguez", LocalDate.of(2001, 11, 5), "DAM", 5.6, 6.5);
        alumnos[3] = new Alumnos(5, "Pedro", "Sánchez", LocalDate.of(2003, 4, 10), "DAW", 9.0, 9.5);
        alumnos[4] = new Alumnos(6, "Marta", "López", LocalDate.of(2002, 2, 28), "DAW", 8.5, 8.7);
        alumnos[5] = new Alumnos(7, "David", "García", LocalDate.of(2004, 9, 30), "DAM", 7.2, 6.9);
        alumnos[6] = new Alumnos(8, "Sara", "Martín", LocalDate.of(2003, 3, 19), "DAW", 6.8, 7.0);
        alumnos[7] = new Alumnos(9, "Luis", "Hernández", LocalDate.of(2001, 7, 25), "DAM", 9.4, 9.2);
        alumnos[8] = new Alumnos(10, "Elena", "Jiménez", LocalDate.of(2002, 6, 13), "DAW", 7.9, 8.1);
        // Asegúrate de llenar todos los índices
        alumnos[9] = new Alumnos(11, "Carlos", "Ramírez", LocalDate.of(2003, 5, 30), "DAW", 6.7, 7.3);
    }

public void alumnosMedia(){
    for (int i = 0; i < alumnos.length; i++) {
        System.out.println(alumnos[i].toString());
        System.out.println(" media notas " + alumnos[i].MediaNotas());
    }
}
public void mostrarnotas(){
    for (int i = 0; i < alumnos.length; i++) {
        System.out.println(alumnos[i].resumenAlumno());
    }
}
    public String nombrePorExpediente(int expediente) {
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNumeroExpediente() == expediente) {
                return alumnos[i].getNombre();
            }
        }
        return "Alumno no encontrado";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionAlumnos gestionAlumnos = new GestionAlumnos();
        gestionAlumnos.llenarArray();

        gestionAlumnos.alumnosMedia();
        gestionAlumnos.mostrarnotas();
        System.out.println("Introduce un n de expediente");
        int num = sc.nextInt();

        String nombre = gestionAlumnos.nombrePorExpediente(num);
        System.out.println(num + " expediente pertenece a " + nombre);

    }



}
