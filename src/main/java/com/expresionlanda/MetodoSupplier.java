package com.expresionlanda;

import java.util.Random;
import java.util.function.Supplier;

public class MetodoSupplier {
    public static void main(String[] args) {
        Supplier<Integer> generarNumeroAleatorio = () -> {
            Random random = new Random();
            return random.nextInt(100);
        };
    
        Integer numeroAleatorio = generarNumeroAleatorio.get();
        System.out.println("Número aleatorio: " + numeroAleatorio);

        Integer otroNumeroAleatorio = generarNumeroAleatorio.get();
        System.out.println("Otro Número Aleatorio: " + otroNumeroAleatorio);
    }
}
