package com.java;

import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Example01 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF");

        List<String> res = list.stream()
                                    .collect(Collectors.toList());

        Set<String> set = list.stream()
                .collect(Collectors.toSet());

        SortedSet<String> treeSet = list.stream()
                .collect(Collectors.toCollection(TreeSet::new));

    }
}
