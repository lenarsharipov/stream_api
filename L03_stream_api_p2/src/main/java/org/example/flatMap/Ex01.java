package org.example.flatMap;

import java.util.Collection;
import java.util.List;
import java.util.stream.IntStream;

public class Ex01 {

    public static void main(String[] args) {
        // map: x -> y

        List<List<Integer>> list = List.of(
                List.of(1, 2, 3, 4),
                List.of(5, 6, 7),
                List.of(8, 9)
        );

        var sum1 = list.stream() // List<Integer> [1, 2, 3, 4], [5, 6, 7], [8, 9]
                .flatMap(l -> l.stream()) // == .flatMap(Collection::stream) // Integers: [1, 2, 3, 4, 5, 6, 7, 8, 9]
                .reduce(0, (a, b) -> a + b);

        var sum2 = list.stream() // List<Integer> [1, 2, 3, 4], [5, 6, 7], [8, 9]
                .flatMapToInt(l -> l.stream().mapToInt(el -> el)) // == .flatMap(Collection::stream) // Integers: [1, 2, 3, 4, 5, 6, 7, 8, 9]
                .sum();

        System.out.println(sum1); // 45 sum of all integers
        System.out.println(sum2); // 45 sum of all integers

    }

}
