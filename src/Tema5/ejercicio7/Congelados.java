package Tema5.ejercicio7;

import java.time.LocalDate;

public class Congelados extends Producto {
    private float temperaturacongelacion;

    public Congelados(int id, String descripcion, LocalDate fechacaducidad, int numlote, float temperaturacongelacion) {
        super(id, descripcion, fechacaducidad, numlote);
        this.temperaturacongelacion = temperaturacongelacion;
    }

    public float getTemperaturacongelacion() {
        return temperaturacongelacion;
    }

    public void setTemperaturacongelacion(float temperaturacongelacion) {
        this.temperaturacongelacion = temperaturacongelacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Congelados{" +
                "temperaturacongelacion=" + temperaturacongelacion +
                '}';
    }
    //abstract
}
