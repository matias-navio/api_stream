package org.example.api_ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;


public class EjemploStreamRange {
    public static void main(String[] args) {

        // se usa la clase IntStream para crear rangos de numeros, ya que stream no la tiene por defecto
        IntStream numbers = IntStream.range(5, 20).peek(System.out::println);

        IntSummaryStatistics stats = numbers.summaryStatistics();
        System.out.println("min: " + stats.getMin());
        System.out.println("max: " + stats.getMax());
        System.out.println("uma: " + stats.getSum());
        System.out.println("promedio: " + stats.getAverage());
        System.out.println("totla ele.: " + stats.getCount());
    }
    
}
