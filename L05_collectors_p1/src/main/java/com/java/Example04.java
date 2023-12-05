package com.java;

import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Example04 {

    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        SortedMap<String, Integer> map1 = list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        String::length,
                        Integer::sum, // == (prev, curr) -> prev + curr
                        TreeMap::new  // == () -> new TreeMap<>()
                ));

        System.out.println(map1);
    }

}