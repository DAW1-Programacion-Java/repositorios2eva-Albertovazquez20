package Tema4.ejercicio3;

public class Taxi {
    private String matricula;
    private String distrito;
    private String tipoMotor;
    private double latitud;
    private double longitud;

    public Taxi(String matricula, String distrito, String tipoMotor, double latitud, double longitud) {
        this.matricula = matricula;
        this.distrito = distrito;
        this.tipoMotor = tipoMotor;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public Taxi(String matricula, String distrito, String tipoMotor) {
        this.matricula = matricula;
        this.distrito = distrito;
        this.tipoMotor = tipoMotor;
        this.latitud = 0;
        this.longitud = 0;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public boolean mismoDistrito(Taxi otroTaxi) {
        return this.distrito.equalsIgnoreCase(otroTaxi.getDistrito());
    }

    public String getCoordenadas() {
        return "Latitud: " + latitud + ", Longitud: " + longitud;
    }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Distrito: " + distrito + ", Tipo de Motor: " + tipoMotor
                + ", Coordenadas: " + getCoordenadas();
    }
}
