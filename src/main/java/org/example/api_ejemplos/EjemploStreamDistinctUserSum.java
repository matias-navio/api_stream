package org.example.api_ejemplos;

import org.example.api_ejemplos.models.User;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUserSum {
    public static void main(String[] args) {

        // poblando un objeto usuario

        IntStream lengthName = Stream
                .of("Matias Navio", "Juan Elias", "Pepe Perez", "Santiago Federici", "Pepe Garcia", "Juan Elias", "Juan Elias")
                .map(n -> new User(n.split(" ")[0], n.split(" ")[1]))
                .distinct()
                .mapToInt(n -> n.toString().length())
                .peek(n -> System.out.println("Largo de los nombres: " + n));

        IntSummaryStatistics stats = lengthName.summaryStatistics();
        System.out.println("Suma de los nombres: " + stats.getSum());
        System.out.println("Nombre mas largo: " + stats.getMax());
        System.out.println("Nombre mas corto: " + stats.getMin());
        System.out.println("Promedio de nombres: " + stats.getAverage());
    }



}