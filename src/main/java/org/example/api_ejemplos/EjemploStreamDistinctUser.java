package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.stream.Stream;

public class EjemploStreamDistinctUser {
    public static void main(String[] args) {

        // poblando un objeto usuario

        Stream<User> nombres = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia", "Juan Elias", "Juan Elias")
                .map(n -> new User(n.split(" ")[0], n.split(" ")[1]))
                .distinct();

        nombres.forEach(System.out::println);
    }



}