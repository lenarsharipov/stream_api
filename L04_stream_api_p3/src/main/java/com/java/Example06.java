package com.java;

import java.util.ArrayList;
import java.util.List;

public class Example06 {
    public static void main(String[] args) {
        List<Integer> input = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> output = new ArrayList<>(); // [2, 4, 6, 8, 10]
        input.stream()
                .filter(n -> n % 2 == 0)
                .peek(output::add) // .peek(n -> output.add(n)) NOT RECOMMENDED
                .forEach(System.out::println);
    }
}
