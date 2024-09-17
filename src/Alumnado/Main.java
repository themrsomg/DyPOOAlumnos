package Alumnado;

import javax.swing.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        GestionEstudiantes gestion = new GestionEstudiantes();

        for (int i = 0; i < 3; i++) {
            String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante " + (i + 1) + ":");
            String materiasStr = JOptionPane.showInputDialog(null, "Ingrese las materias de " + nombre + " separadas por comas:");

            Set<String> materias = new HashSet<>(Arrays.asList(materiasStr.split(",")));
            gestion.agregarEstudiante(nombre, materias);
        }

        JOptionPane.showMessageDialog(null, "Lista de estudiantes:\n" + gestion.mostrarEstudiantes());

        String nombreEstudiante = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante para ver sus materias:");
        JOptionPane.showMessageDialog(null, gestion.mostrarMateriasDeEstudiante(nombreEstudiante));
    }
}
