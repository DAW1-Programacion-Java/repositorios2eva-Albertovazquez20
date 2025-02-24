package Tema5.ejercicio_prueba;

import java.time.LocalDate;

public class Mecanicos extends Trabajadores {
    private LocalDate antiguedad;
    private Categoria categoria;
    private double sueldoBase;

    public Mecanicos(int id, String nombre, LocalDate fechaNacimiento, LocalDate antiguedad, Categoria categoria, double sueldoBase) {
        super(id, nombre, fechaNacimiento);
        this.antiguedad = antiguedad;
        this.categoria = categoria;
        this.sueldoBase = sueldoBase;
    }

    public LocalDate getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(LocalDate antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(double sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return super.toString() + "Mecanicos{" +
                "antiguedad=" + antiguedad +
                ", categoria=" + categoria +
                ", sueldoBase=" + sueldoBase +
                '}';
    }

    @Override
    public double calcularSalario() {
        switch (categoria){
            case JEFE_TALLER:
                    return sueldoBase + 1000;
            case OFICIAL:
                return sueldoBase + 800;
            case CHAPISTA:
                return sueldoBase + 500;
            case ELECTRICISTA:
                return sueldoBase + 300;
            case MECANICO:
                return sueldoBase + 200;

        }return sueldoBase;
    }
}
