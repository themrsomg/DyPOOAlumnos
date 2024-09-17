package Alumnado;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionEstudiantes {
    private Map<String, Set<String>> estudiantes;

    public GestionEstudiantes() {
        estudiantes = new HashMap<>();
    }

    public void agregarEstudiante(String nombre, Set<String> materias) {
        if (estudiantes.containsKey(nombre)) {
            estudiantes.get(nombre).addAll(materias);
        } else {
            estudiantes.put(nombre, materias);
        }
    }

    public String mostrarEstudiantes() {
        if (estudiantes.isEmpty()) {
            return "No hay estudiantes registrados.";
        } else {
            StringBuilder result = new StringBuilder();
            for (Map.Entry<String, Set<String>> entry : estudiantes.entrySet()) {
                String nombre = entry.getKey();
                Set<String> materias = entry.getValue();
                result.append("Estudiante: ").append(nombre).append("\n");
                result.append("Materias: ").append(Arrays.toString(materias.toArray())).append("\n\n");
            }
            return result.toString();
        }
    }

    public String mostrarMateriasDeEstudiante(String nombre) {
        if (estudiantes.containsKey(nombre)) {
            Set<String> materias = estudiantes.get(nombre);
            return "Materias de " + nombre + ": " + Arrays.toString(materias.toArray());
        } else {
            return "El estudiante " + nombre + " no está registrado.";
        }
    }
}
