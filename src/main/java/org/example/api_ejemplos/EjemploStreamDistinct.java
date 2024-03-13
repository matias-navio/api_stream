package org.example.api_ejemplos;

import java.util.stream.Stream;

public class EjemploStreamDistinct {
    public static void main(String[] args) {

        Stream<String> nombres = Stream.of("Matias", "Juan", "Santiago", "Juan", "Mariano", "Exequiel", "Exequiel")
            .distinct();

        nombres.forEach(n -> System.out.println("Nombres de la lista: " + n));

    }
}