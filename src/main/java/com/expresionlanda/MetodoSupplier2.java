package com.expresionlanda;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public class MetodoSupplier2 {
    public static void main(String[] args) {
        String[] nombres = {"Carlos", "Ana", "Jose", "Maria", "Luis"};

        Set<String> nombresUsados = new HashSet<>();

        Supplier<Persona> generarPersonaAleatoria = () -> {
            Random random = new Random();
            String nombreAleatorio = null;

            while (true) {
                nombreAleatorio = nombres[random.nextInt(nombres.length)];
                if (!nombresUsados.contains(nombreAleatorio)) {
                    nombresUsados.add(nombreAleatorio);
                    break;
                }
            }
            int edadAleatoria = 18 + random.nextInt(43);
            return new Persona(nombreAleatorio, edadAleatoria);
        };
        for (int i = 0; i < nombres.length; i++) {
            Persona persona = generarPersonaAleatoria.get();
            System.out.println(persona);
        }
    }
}
