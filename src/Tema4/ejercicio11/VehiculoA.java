package Tema4.ejercicio11;

public class VehiculoA {
    private String matricula;
    private String marca;
    private  String modelo;
    private int potencia;
    private double consumomedio;
    private double precioalquilerdia;

    public VehiculoA(String matricula, String marca, String modelo, int potencia, double consumomedio, double precioalquilerdia) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.consumomedio = consumomedio;
        this.precioalquilerdia = precioalquilerdia;
    }

    public VehiculoA(String matricula, double precioalquilerdia) {
        this.matricula = matricula;
        this.precioalquilerdia = precioalquilerdia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getConsumomedio() {
        return consumomedio;
    }

    public void setConsumomedio(double consumomedio) {
        this.consumomedio = consumomedio;
    }

    public double getPrecioalquilerdia() {
        return precioalquilerdia;
    }

    public void setPrecioalquilerdia(double precioalquilerdia) {
        this.precioalquilerdia = precioalquilerdia;
    }

    @Override
    public String toString() {
        return "VehiculoA{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", potencia='" + potencia + '\'' +
                ", consumomedio='" + consumomedio + '\'' +
                ", precioalquilerdia=" + precioalquilerdia +
                '}';
    }
}
