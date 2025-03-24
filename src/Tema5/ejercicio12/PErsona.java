package Tema5.ejercicio12;

public class PErsona implements Comparable<PErsona> {
    private String dni;
    private String nombre;
    private String puestoTrabajo;

    public PErsona(String dni, String nombre, String puestoTrabajo) {
        this.dni = dni;
        this.nombre = nombre;
        this.puestoTrabajo = puestoTrabajo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuestoTrabajo() {
        return puestoTrabajo;
    }

    public void setPuestoTrabajo(String puestoTrabajo) {
        this.puestoTrabajo = puestoTrabajo;
    }

    @Override
    public int compareTo(PErsona o) {
        return this.dni.compareTo(o.getDni());
    }

    @Override
    public String toString() {
        return "PErsona{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", puestoTrabajo='" + puestoTrabajo + '\'' +
                '}';
    }
}
