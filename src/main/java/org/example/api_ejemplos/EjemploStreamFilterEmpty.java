package org.example.api_ejemplos;


import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        Long nombres = Stream
                .of("Matias Navio", "", "Pepe Perez", "Santiago Federici", "")
                .filter(n -> n.isEmpty())
                .peek(System.out::println)
                .count();
        
        System.out.println("Nombres vacios: " + nombres);


    }
}