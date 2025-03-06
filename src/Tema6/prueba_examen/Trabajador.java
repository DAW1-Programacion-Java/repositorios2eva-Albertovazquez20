package Tema6.prueba_examen;

import java.time.LocalDate;

public abstract class Trabajador implements Comparable<Trabajador> {
    private int id;
    private String nombre;
    private LocalDate fechanacimiento;

    public Trabajador(int id, String nombre, LocalDate fechanacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
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

    public LocalDate getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(LocalDate fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    @Override
    public int compareTo(Trabajador o) {
       if(this.id < o.id){
           return -1;
       }if (this.id > o.id){
           return 1;
        }
       return 0;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Trabajador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", fechanacimiento=" + fechanacimiento +
                '}';
    }

}
