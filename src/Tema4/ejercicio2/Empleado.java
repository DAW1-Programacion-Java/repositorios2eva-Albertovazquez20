package Tema4.ejercicio2;

public class Empleado {

    private int id;
    private String nombre;
    private String apellidos;
    private double salarioMensual;

    public Empleado(int id, String nombre, String apellidos, double salarioMensual) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioMensual = salarioMensual;
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(double salarioMensual) {
        this.salarioMensual = salarioMensual;
    }

    public String getNombreCompleto() {
        return apellidos + ", " + nombre;
    }

    public double getSalarioAnual() {
        return salarioMensual * 12;
    }

    public void incrementaSalario(int porcentaje) {
        salarioMensual += salarioMensual * porcentaje / 100.0;
    }


    @Override
    public String toString() {
        return "Empleado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos +
                ", salario mensual=" + salarioMensual + "]";
    }
}
