package com.java;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example03 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        Map<String, Integer> map1 = list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        String::length,
                        Integer::sum // == (prev, curr) -> prev + curr
                ));

        System.out.println(map1);
    }

}