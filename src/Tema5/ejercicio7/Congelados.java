package Tema5.ejercicio7;

public class Congelados {
    private float temperaturacongelacion;

    public Congelados(float temperaturacongelacion) {
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
