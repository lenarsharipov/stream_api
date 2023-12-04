package com.java;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Example02 {
    public static void main(String[] args) {
        List<Integer> list = List.of(3, 2, 4, 5, 2, 3, 5, 1, 1, 5, 4);
        // distinct()
        // sorted() / sorted(Comparator)
        Comparator<Integer> comparator = Collections.reverseOrder();
        list.stream()
                .distinct()
                .sorted(comparator) // Comparator
                .forEach(System.out::println);

        separate();

    }

    private static void separate() {
        System.out.println("*".repeat(50));
    }

}
