package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {

        // Creamos un Stream y los recorremos

        List<String> nombres = Arrays.asList("Matias", "Juan", "Pepe", "Santiago");
        nombres.stream()
                .map(String::toLowerCase)
                .peek(System.out::println)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println(" ");

        Stream.of("one", "two", "three", "four")
                .filter(num -> num.equals("two"))
                .peek(num -> System.out.println("Elemtos filtrados: " + num))
                .map(num -> num.toUpperCase())
                .peek(num -> System.out.println("Elemento en mayuscula: " + num))
                .collect(Collectors.toList());

        System.out.println("");

        // poblando un objeto usuario

        Stream<User> users = Stream.of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .peek(u -> System.out.println("Nombre: " + u.toString()))
                .map(user -> {
                    String nameLower = user.getName().toLowerCase();
                    user.setName(nameLower);
                    return user;
                });
        List<User> userList = users.collect(Collectors.toList());
        userList.forEach(u -> System.out.println("Nombre: " + u.toString()));
    }



}