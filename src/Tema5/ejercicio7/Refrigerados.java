package Tema5.ejercicio7;

import java.time.LocalDate;

public class Refrigerados extends Producto {
    private String codigorganismo;

    public Refrigerados(int id, String descripcion, LocalDate fechacaducidad, int numlote, String codigorganismo) {
        super(id, descripcion, fechacaducidad, numlote);
        this.codigorganismo = codigorganismo;
    }

    public String getCodigorganismo() {
        return codigorganismo;
    }

    public void setCodigorganismo(String codigorganismo) {
        this.codigorganismo = codigorganismo;
    }

    @Override
    public String toString() {
        return super.toString() + "Refrigerados{" +
                "codigorganismo='" + codigorganismo + '\'' +
                '}';
    }
}
