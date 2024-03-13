package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.Optional;
import java.util.stream.Stream;

public class EjemploStreamFilterEmpty {
    public static void main(String[] args) {

        Stream<User> users = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getName().equals("Pepex"));

        Optional<User> user = users.findFirst();
        user.ifPresentOrElse(u -> System.out.println("Nombre: " + user.get().getName()), 
                            () -> System.out.println("El valor no está presente"));
        


    }



}