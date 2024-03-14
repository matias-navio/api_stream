package org.example.api_ejemplos;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.example.api_ejemplos.models.User;

public class EjemploStreamFlatMap {
    public static void main(String[] args) {
        
        Stream<User> names = Stream
                .of("Matias Navio", "Juan Elias", "Santiago Federici")
                .map(n -> new User(n.split(" ")[0], n.split(" ")[1]))
                .flatMap(n -> {
                    if(n.getName().equals("Matias")){
                        return Stream.of(n);
                    }
                    
                    return Stream.empty();
                });

        List<User> listNames = names.collect(Collectors.toList());
        listNames.forEach(System.out::println);

    }
}
