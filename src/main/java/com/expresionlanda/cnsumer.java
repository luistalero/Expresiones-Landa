package com.expresionlanda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class cnsumer {
    public static void main(String[] args) {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new Estudiante("Carlos", 85.5));
        estudiantes.add(new Estudiante("Jose", 32.5));
        estudiantes.add(new Estudiante("Valeria", 65.5));
        estudiantes.add(new Estudiante("Mario", 75.2));
        estudiantes.add(new Estudiante("Anabelle", 90));
        
        Consumer<Estudiante> imprimirNombre = estudiante -> System.out.println(estudiante.getNombre());
        
        estudiantes.forEach(imprimirNombre);
    }
}
