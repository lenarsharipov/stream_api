package com.java;

import java.util.List;
import java.util.stream.Stream;

public class Example07 {
    public static void main(String[] args) {
        // collect() == terminal op
        // Collector == object


        List<Integer> result = Stream.of(1, 2, 3, 4, 5)
                .map(el -> el * 2) // [2, 4, 6, 8, 10]
//                .collect(Collectors.toList());
                .toList();

        System.out.println(result);
    }

}
