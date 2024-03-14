package org.example.api_ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.example.api_ejemplos.models.User;

public class EjemploStreamListToStream {
    public static void main(String[] args) {
        
        List<User> users = Arrays.asList(
            new User("Matias", "Navio"),
            new User("Juan", "Elias"),
            new User("Santiago", "Federici"),
            new User("Exequiel", "Carrizo"),
            new User("Giuliano", "Blengini"),
            new User("Matias", "Mondello")
        );

        users.stream()
            .map(u -> u.getName().toUpperCase()
            .concat(" ")
            .concat(u.getLastname().toLowerCase()))
            .flatMap(nombre -> {
                if(nombre.contains("Matias".toUpperCase())){
                    return Stream.of(nombre);
                }
                return Stream.empty();
            })
            .forEach(System.out::println);

    }
}
