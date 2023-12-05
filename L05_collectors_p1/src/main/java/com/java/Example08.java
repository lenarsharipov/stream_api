package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class Example08 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        List<Integer> res =
                list.stream()
                        .collect(
                                Collectors.mapping(
                                        s -> s.length(),
                                        Collectors.filtering(
                                                n -> n % 2 == 0,
                                                Collectors.toList()
                                        )
                                )
                        );

        System.out.println(res);

        // the same result as follows:
        List<Integer> res2 =
                list.stream()
                        .map(String::length)
                        .filter(n -> n % 2 == 0)
                        .toList();

        System.out.println(res2);
    }
}
