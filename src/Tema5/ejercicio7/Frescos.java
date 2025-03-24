package Tema5.ejercicio7;

import java.time.LocalDate;

public class Frescos extends Producto {
    private LocalDate fechaenvasado;
    private String pais;

    public Frescos(int id, String descripcion, LocalDate fechacaducidad, int numlote, LocalDate fechaenvasado, String pais) {
        super(id, descripcion, fechacaducidad, numlote);
        this.fechaenvasado = fechaenvasado;
        this.pais = pais;
    }

    public LocalDate getFechaenvasado() {
        return fechaenvasado;
    }

    public void setFechaenvasado(LocalDate fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return super.toString() + "Frescos{" +
                "fechaenvasado=" + fechaenvasado +
                ", pais='" + pais + '\'' +
                '}';
    }
}
