package org.example.api_ejemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EjemploStream {
    public static void main(String[] args) {

        // Creamos un Stream y los recorremos

        Stream<String> nombres = Stream.of("Matias", "Juan", "Pepe", "Santiago");
        Stream<String> nombre= Stream.of("Rodrigo");
        // Cualquiera de estas dos maneras sirven para mostrar los datos
        nombres.forEach(System.out::println);
        nombre.forEach(n -> System.out.println(n));

        System.out.println("");

        // Creamos un Stream a partir de un objeto Collection

        List<String> frutas = new ArrayList<>();
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("Uva");
        frutas.stream().forEach(System.out::println);


    }
}