package Tema6.ejercicio4;

import java.time.LocalDate;

public class Persona implements Comparable<Persona> {
    private int id;
    private String nombre;
    private LocalDate fechaNAcimiento;

    public Persona(int id, String nombre, LocalDate fechaNAcimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNAcimiento = fechaNAcimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNAcimiento() {
        return fechaNAcimiento;
    }

    public void setFechaNAcimiento(LocalDate fechaNAcimiento) {
        this.fechaNAcimiento = fechaNAcimiento;
    }

    @Override
    public int compareTo(Persona o) {
        return this.getFechaNAcimiento().compareTo(o.getFechaNAcimiento());
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNAcimiento=" + fechaNAcimiento +
                '}';
    }
}
