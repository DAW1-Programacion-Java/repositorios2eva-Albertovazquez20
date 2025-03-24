package Tema7.Ejercicio10;

import java.util.HashMap;
import java.util.Map;

public class Estudiante {
    private Integer id;
    private String nombre;
    private String curso;
    private Map<String, Double> asigNota = new HashMap<>();

    public Estudiante(Integer id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.asigNota = new HashMap<>();
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Map<String, Double> getAsigNota() {
        return asigNota;
    }

    public void setAsigNota(Map<String, Double> asigNota) {
        this.asigNota = asigNota;
    }

    public void addNota(String asig, double not){
        asigNota.put(asig, not);
    }



    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", asigNota=" + asigNota +
                '}';
    }
}
