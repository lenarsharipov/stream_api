package com.java;

import java.util.stream.Stream;

public class Example03 {
    public static void main(String[] args) {
        Stream<Cat> cats = Stream.of(
                new Cat(3),
                new Cat(1),
                new Cat(5),
                new Cat(4),
                new Cat(2)
        );

        cats.sorted()
                .forEach(System.out::println);
    }
}
