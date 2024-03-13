package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStreamFilterAnyMatch {
    public static void main(String[] args) {

        Boolean existe = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .anyMatch(u -> u.getId().equals(2));

        if(existe){
            System.out.println("Si existe este usuario!");
        }else{
            System.out.println("No existe este usuario!");
        }

        List<User> userList = Arrays.asList(
                    new User("Matias", "Navio"),
                    new User("Juan", "Elias"),
                    new User("Santiago", "Federici"),
                    new User("Pepe", "Perez"),
                    new User("Maria", "Gonzales"));

        // esto es lo mismo que esto -> anyMatch(u -> u.getId().equals(id))
        boolean resultado = false;
        for(User u : userList){
            if(u.getId().equals(8)){
                resultado = true;
                break;
            }
        }
        System.out.println(resultado);
    }



}