package Tema5.ejercicio1;

import java.time.LocalDate;

public class VehiculoAlquilado {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private LocalDate fechalquiler;
    private int numerodiasalquiler;

    public VehiculoAlquilado(Vehiculo vehiculo, Cliente cliente, LocalDate fechalquiler, int numerodiasalquiler) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.fechalquiler = fechalquiler;
        this.numerodiasalquiler = numerodiasalquiler;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getFechalquiler() {
        return fechalquiler;
    }

    public void setFechalquiler(LocalDate fechalquiler) {
        this.fechalquiler = fechalquiler;
    }

    public int getNumerodiasalquiler() {
        return numerodiasalquiler;
    }

    public void setNumerodiasalquiler(int numerodiasalquiler) {
        this.numerodiasalquiler = numerodiasalquiler;
    }

    public double getImporteTotal(){
        return numerodiasalquiler * vehiculo.getTarifa();
    }


    @Override
    public String toString() {
        return "VehiculoAlquilado{" +
                "vehiculo=" + vehiculo +
                ", cliente=" + cliente +
                ", fechalquiler=" + fechalquiler +
                ", numerodiasalquiler=" + numerodiasalquiler +
                '}';
    }
}
