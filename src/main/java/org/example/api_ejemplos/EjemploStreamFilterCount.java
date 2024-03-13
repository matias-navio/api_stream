package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.stream.Stream;

public class EjemploStreamFilterCount {
    public static void main(String[] args) {

        Long count = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .count();

        System.out.println("Cantidad de elementos: " + count);
    }



}