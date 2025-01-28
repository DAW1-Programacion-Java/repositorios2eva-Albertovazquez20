package Tema4.ejercicio10;

import java.time.LocalDateTime;

public class Vehiculo {
    private String matricula;
    private LocalDateTime horaentrada;

    public Vehiculo(String matricula) {
        this.matricula = matricula;
        this.horaentrada = LocalDateTime.now();
    }

    public String getMatricula() {
        return matricula;
    }

    public LocalDateTime getHoraentrada() {
        return horaentrada;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setHoraentrada(LocalDateTime horaentrada) {
        this.horaentrada = horaentrada;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", horaentrada=" + horaentrada +
                '}';
    }
}

