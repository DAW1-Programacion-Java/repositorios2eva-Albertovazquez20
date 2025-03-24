package Tema5.ejercicio6;

public class Turismo extends Vehiculo{
private int puertas;
private boolean automatico;

    public Turismo(String matricula, String marca, String modelo, double tarifa, boolean disponible, int puertas, boolean automatico) {
        super(matricula, marca, modelo, tarifa, disponible);
        this.puertas = puertas;
        this.automatico = automatico;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public boolean isAutomatico() {
        return automatico;
    }

    public void setAutomatico(boolean automatico) {
        this.automatico = automatico;
    }

    @Override
    public String toString() {
        return super.toString() + "Turismo{" +
                "puertas=" + puertas +
                ", automatico=" + automatico +
                '}';
    }
}
