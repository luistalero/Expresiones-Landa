package com.expresionlanda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class biConsumer {
    public static void main(String[] args) {
        Map<String, Integer> items = new HashMap<>();
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        items.put("Mango", 25);
        items.put("Grapes", 50);
    
        BiConsumer<String, Integer> procesarEntrada = (clave, valor) -> System.out.println("Fruta: " + clave + ", cantidad: " + valor);

        items.forEach(procesarEntrada);
    }
}
