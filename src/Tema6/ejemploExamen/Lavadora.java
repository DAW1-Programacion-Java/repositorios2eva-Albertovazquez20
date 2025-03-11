package Tema6.ejemploExamen;

public class Lavadora extends Electrodomestico{
    private double precio;
    private boolean aguaCaliente;

    public Lavadora( String marca, double potencia) {
        super("Lavadora", marca, potencia);
        this.precio = 0.0;
        this.aguaCaliente = false;
    }

    public Lavadora(String marca, double potencia, double precio, boolean aguaCaliente) {
        super("Lavadora", marca, potencia);
        this.precio = precio;
        this.aguaCaliente = aguaCaliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public double getConsumoLavadora(int horas) {
        double consumo = 0;
        if (aguaCaliente){
            consumo = horas * (getPotencia() + getPotencia() * 0.20);
        }else{
            consumo = horas * getPotencia();
        }
        return consumo;
    }

    public double getCosteConsumoLava(int horas, double costeHora){
        return (getPotencia() * horas) * costeHora;
    }


    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", aguaCaliente=" + aguaCaliente +
                '}';
    }


}
