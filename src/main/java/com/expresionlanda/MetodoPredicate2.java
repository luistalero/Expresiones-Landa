package com.expresionlanda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MetodoPredicate2 {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("carlos", 25));
        personas.add(new Persona("Sofia", 12));
        personas.add(new Persona("Ana", 23));
        personas.add(new Persona("Juan", 15));
        personas.add(new Persona("Jose", 30));
        personas.add(new Persona("Maria", 20));

        Predicate<Persona> esMayor = p -> p.getEdad() >= 18;
        List<Persona> mayorEdad = personas.stream().filter(esMayor).collect(Collectors.toList());
    
        
        Comparator<Persona> porNombre = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
        Collections.sort(mayorEdad, porNombre);
        
        
        System.out.println("Mayores de Edad: " + mayorEdad);
        
    }
}
