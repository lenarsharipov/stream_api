package com.java;

import java.util.List;

public class Example01 {

    public static void main(String[] args) {
        List<Integer> list = List.of(3, 2, 4, 5, 2, 3, 5, 1, 1, 5, 4);
        // distinct()
        // sorted() / sorted(Comparator)
        list.stream()
                .distinct() // no duplicates
                .forEach(System.out::println);

        separate();

        list.stream()
                .distinct()
                .sorted() // Comparable
                .forEach(System.out::println);

        separate();


    }

    private static void separate() {
        System.out.println("*".repeat(50));
    }

}