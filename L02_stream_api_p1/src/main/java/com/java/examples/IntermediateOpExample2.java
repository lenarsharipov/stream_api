package com.java.examples;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class IntermediateOpExample2 {
    // for example, we have a method returning Stream.
    // To avoid returning null, we may return an empty stream
    public static Stream<Integer> m1() {
        // some action
        return Stream.empty();
    }

    public static void main(String[] args) {
        // used generally to avoid a null value
        Stream<Integer> s1 = Stream.empty(); // finite source

        Stream<Integer> s2 = Stream.of(1, 2, 3, 4, 5, 6, 7); // finite source
        s2.forEach(System.out::println);

        Supplier<Integer> supplier = () -> new Random().nextInt(1_000);
        Stream<Integer> s3 = Stream.generate(supplier); // infinite source
        s3.limit(10).forEach(System.out::println);

        Stream<Integer> s4 = Stream.iterate(3, i -> i + 15); // infinite stream
        s4.limit(10).forEach(System.out::println);

        // starting with java 9
        Stream<Integer> s5 = Stream.iterate(30,
                                                i -> i <= 100,
                                                i -> i + 10); // finite stream
        s5.forEach(System.out::println);

    }
}
