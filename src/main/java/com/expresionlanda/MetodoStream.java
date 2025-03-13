package com.expresionlanda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetodoStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
 
        System.out.println("Numeros pares: " + pares);

        List<Integer> cuadros = numeros.stream().map(n -> n * n).collect(Collectors.toList());

        System.out.println("cuadros de los números: " + cuadros);

        List<Integer> cuadradosMayoresQue5 = numeros.stream().filter(n -> n > 5).map(n -> n * n).collect(Collectors.toList());

        System.out.println("Cuadrados de números mayores que 5: " + cuadradosMayoresQue5);
    }
}
