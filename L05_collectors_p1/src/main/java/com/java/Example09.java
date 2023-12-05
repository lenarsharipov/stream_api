package com.java;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Example09 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        Map<Boolean, List<String>> map1 =
                list.stream()
                        .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));
        System.out.println(map1);

        System.out.println("*".repeat(50));

        Map<Boolean, Set<String>> map2 =
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        s -> s.length() % 2 == 0,
                                        Collectors.toSet()
                                )
                        );
        System.out.println(map2);

        System.out.println("*".repeat(50));

        Map<Boolean, String> map3 =
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        s -> s.length() % 2 == 0,
                                        Collectors.joining()
                                )
                        );
        System.out.println(map3);

        System.out.println("*".repeat(50));

        Map<Boolean, String> map4 =
                list.stream()
                        .collect(
                                Collectors.partitioningBy(
                                        s -> s.length() % 2 == 0,
                                        Collectors.mapping(s -> String.valueOf(s.length()), Collectors.joining())
                                )
                        );
        System.out.println(map4);
    }
}