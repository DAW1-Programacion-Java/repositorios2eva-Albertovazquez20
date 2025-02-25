package Tema6.prueba_examen;

import java.time.LocalDate;

public class Produccion extends Trabajador {
private String puesto;
private double salarioBase;

    public Produccion(int id, String nombre, LocalDate fechanacimiento, String puesto, double salarioBase) {
        super(id, nombre, fechanacimiento);
        this.puesto = puesto;
        this.salarioBase = salarioBase;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}
