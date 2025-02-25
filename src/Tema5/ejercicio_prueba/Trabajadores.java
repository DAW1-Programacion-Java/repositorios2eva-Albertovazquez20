package Tema5.ejercicio_prueba;

import java.time.LocalDate;

public abstract class Trabajadores implements Comparable <Trabajadores>{
    private int id;
    private  String nombre;
    private LocalDate fechaNacimiento;

    public Trabajadores(int id, String nombre, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
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

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public abstract double calcularSalario();

    @Override
    public int compareTo(Trabajadores o) {
        return this.getNombre().compareTo(o.getNombre());
    }

    @Override
    public String toString() {
        return "Trabajadores{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }



}
