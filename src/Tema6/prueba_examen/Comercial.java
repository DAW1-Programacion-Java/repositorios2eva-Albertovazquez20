package Tema6.prueba_examen;

import java.time.LocalDate;

public class Comercial extends Trabajador implements Iventas{
    private double kilometros;
    private double salarioBase;

    public Comercial(int id, String nombre, LocalDate fechanacimiento, double kilometros, double salarioBase) {
        super(id, nombre, fechanacimiento);
        this.kilometros = kilometros;
        this.salarioBase = salarioBase;
    }

    public double getKilometros() {
        return kilometros;
    }

    public void setKilometros(double kilometros) {
        this.kilometros = kilometros;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (kilometros * 0.5);
    }

    public double ventasRealizadas(){
        return kilometros * 0.5;
    }
    @Override
    public String toString() {
        return super.toString() + "Comercial{" +
                "kilometros=" + kilometros +
                ", salarioBase=" + salarioBase +
                '}';
    }
}
