package com.expresionlanda;

import java.util.function.Predicate;

public class MetodoPredicate {
    public static void main(String[] args) {
        Predicate<Integer> esPar = n -> n % 2 == 0;

        System.out.println("4 es par: " + esPar.test(4));
        System.out.println("7 es par: " + esPar.test(7));
    }
}
