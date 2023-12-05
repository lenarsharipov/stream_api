package com.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example02 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF");

        Map<String, Integer> map1 = list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        String::length
                ));

        System.out.println(map1);
    }
}
