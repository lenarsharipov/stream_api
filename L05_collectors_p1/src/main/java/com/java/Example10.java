package com.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example10 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        Map<Integer, List<String>> map1 =
                list.stream()
                        .collect(Collectors.groupingBy(String::length));
        System.out.println(map1);

        System.out.println("*".repeat(50));

        Map<Integer, String> map2 =
                list.stream()
                        .collect(
                                Collectors.groupingBy(
                                        //s -> s.length(),
                                        String::length,
                                        Collectors.mapping(
                                                s -> String.valueOf(s.length()),
                                                Collectors.joining("*")
                                        )
                                )
                        );
        System.out.println(map2);

    }
}
