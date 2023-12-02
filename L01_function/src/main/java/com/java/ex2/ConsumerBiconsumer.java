package com.java.ex2;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerBiconsumer {
    public static void main(String[] args) {
        // Consumer
        // BiConsumer
        // Supplier
        // Function
        // BiFunction
        // Predicate
        // BiPredicate
        // UnaryOperator
        // BinaryOperator

        // Consumer
        Consumer<String> c1 = name -> {
            String result = "Hello " + name + "!";
            System.out.println(result);
        };
        Consumer<String> c2 = System.out::println;
        c1.accept("John");
        c2.accept("Hello!");

        BiConsumer<Integer, String> bc1 = (a, b) -> System.out.println(a + " " + b);
        bc1.accept(10, "John");
    }
}