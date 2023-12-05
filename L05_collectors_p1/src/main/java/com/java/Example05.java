package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class Example05 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        String result =
                list.stream()
                        .collect(Collectors.joining());

        System.out.println(result);

        String result2 =
                list.stream()
                        .collect(Collectors.joining(";"));

        System.out.println(result2);

        String result3 =
                list.stream()
                        .collect(Collectors.joining(",", "{", "}"));

        System.out.println(result3);
    }
}
