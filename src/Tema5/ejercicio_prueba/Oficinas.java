package Tema5.ejercicio_prueba;

import java.time.LocalDate;

public class Oficinas extends Trabajadores{
    String tipoJornada;
    double sueldoBase;

    public Oficinas(int id, String nombre, LocalDate fechaNacimiento, String tipoJornada, double sueldoBase) {
        super(id, nombre, fechaNacimiento);
        this.tipoJornada = tipoJornada;
        this.sueldoBase = sueldoBase;
    }

    public String getTipoJornada() {
        return tipoJornada;
    }

    public void setTipoJornada(String tipoJornada) {
        this.tipoJornada = tipoJornada;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return super.toString() + "Oficinas{" +
                "tipoJornada='" + tipoJornada + '\'' +
                ", sueldoBase=" + sueldoBase +
                '}';
    }

    @Override
    public double calcularSalario() {
        return sueldoBase + 1500;
    }
}
