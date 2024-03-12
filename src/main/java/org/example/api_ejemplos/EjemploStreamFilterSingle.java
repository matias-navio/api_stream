package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle {
    public static void main(String[] args) {

        // poblando un objeto usuario

        Stream<User> users = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepe"))
                .peek(System.out::println);

        Optional<User> user = users.findFirst();
        System.out.println(user.get());

    }



}