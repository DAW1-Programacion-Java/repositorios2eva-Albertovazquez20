package Tema4.ejercicio9;

import java.time.LocalDate;

public class Programa {
    private String nombre;
    private String version;
    private String funcion;
    private int anolanzamiento;
    private String empresa;
    private String tipolicencia;
    private double precio;

    public Programa(String nombre, String version, String funcion, int anolanzamiento, String empresa, String tipolicencia, double precio) {
        this.nombre = nombre;
        this.version = version;
        this.funcion = funcion;
        this.anolanzamiento = anolanzamiento;
        this.empresa = empresa;
        this.tipolicencia = tipolicencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public String getFuncion() {
        return funcion;
    }

    public int getAnolanzamiento() {
        return anolanzamiento;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getTipolicencia() {
        return tipolicencia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public void setAnolanzamiento(int anolanzamiento) {
        this.anolanzamiento = anolanzamiento;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setTipolicencia(String tipolicencia) {
        this.tipolicencia = tipolicencia;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Programa{" +
                "nombre='" + nombre + '\'' +
                ", version=" + version +
                ", funcion='" + funcion + '\'' +
                ", anoLanzamiento=" + anolanzamiento+
                ", empresa='" + empresa + '\'' +
                ", tipoLicencia='" + tipolicencia + '\'' +
                ", precio=" + precio +
                '}';
    }
}
