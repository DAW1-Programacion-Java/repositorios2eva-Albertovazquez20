package Tema7.Ejercicio10;

import java.util.*;

public class GestionEstudiante {
    private List<Estudiante> listaT = new ArrayList<>();

    private void addEstudiante(Estudiante estudiante) {
        listaT.add(estudiante);
    }

    public Optional<Estudiante> getEstudiante(int ide) {
        for (Estudiante e : listaT) {
            if (e.getId() == ide) {
                return Optional.of(e);
            }
        }
        return Optional.empty();
    }

    public Map<String, Double> getNotasEstudiante(int ide) {
        for (Estudiante e : listaT) {
            if (e.getId() == ide) {
                return e.getAsigNota();
            }
        }
        return new HashMap<>();
    }
}
