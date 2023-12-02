package com.java.example1;

import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 5, 6, 3, 8, 9);

        for (Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        list.forEach(el -> {
            if (el % 2 == 0) {
                System.out.println(el);
            }
        });

        list.stream()
                .filter(el -> el % 2 == 0)
                .forEach(System.out::println);
    }
}
