package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.Scanner;
import java.util.stream.Stream;

public class EjemploStreamFilterSingle2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un id: ");
        int id = scanner.nextInt();

        User user = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(u -> u.getId().equals(id))
                .findFirst().get();

        System.out.println("El usuario con es ID es: " + user);
    }



}