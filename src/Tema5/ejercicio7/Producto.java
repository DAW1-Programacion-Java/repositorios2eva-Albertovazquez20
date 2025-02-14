package Tema5.ejercicio7;

import java.time.LocalDate;

public class Producto {
    private int id;
    private String descripcion;
    private LocalDate fechacaducidad;
    private int numlote;

    public Producto(int id, String descripcion, LocalDate fechacaducidad, int numlote) {
        this.id = id;
        this.descripcion = descripcion;
        this.fechacaducidad = fechacaducidad;
        this.numlote = numlote;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(LocalDate fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public int getNumlote() {
        return numlote;
    }

    public void setNumlote(int numlote) {
        this.numlote = numlote;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", fechacaducidad=" + fechacaducidad +
                ", numlote=" + numlote +
                '}';
    }
}
