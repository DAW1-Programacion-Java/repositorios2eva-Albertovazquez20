package Tema5.ejercicio6;

public class Furgoneta extends Vehiculo{
    private int capacidadlitros;
    private int cargamaxima;

    public Furgoneta(String matricula, String marca, String modelo, double tarifa, boolean disponible, int capacidadlitros, int cargamaxima) {
        super(matricula, marca, modelo, tarifa, disponible);
        this.capacidadlitros = capacidadlitros;
        this.cargamaxima = cargamaxima;
    }

    public int getCapacidadlitros() {
        return capacidadlitros;
    }

    public void setCapacidadlitros(int capacidadlitros) {
        this.capacidadlitros = capacidadlitros;
    }

    public int getCargamaxima() {
        return cargamaxima;
    }

    public void setCargamaxima(int cargamaxima) {
        this.cargamaxima = cargamaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "Furgoneta{" +
                "capacidadlitros=" + capacidadlitros +
                ", cargamaxima=" + cargamaxima +
                '}';
    }
}
