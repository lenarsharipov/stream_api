package com.java.examples;

import java.util.List;
import java.util.stream.Stream;

public class TerminalOperationExample1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);

        boolean b1 = list.stream().anyMatch(el -> el % 2 == 0);     // true
        boolean b2 = list.stream().allMatch(el -> el % 2 == 0);     // false
        boolean b3 = list.stream().noneMatch(el -> el % 2 == 0);    // false

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        Stream<Integer> s1 = Stream.iterate(1, i -> i + 1);     // infinite stream: 1 2 3 4 5 ....
        Stream<Integer> s2 = Stream.iterate(1, i -> i + 2);     // infinite stream: 1 3 5 6 7 ....

        list.stream().forEach(el -> {
            try {
                m2(el);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

    }

    static void m2(int a) throws Exception {
        if (a % 2 == 0 && a % 3 == 0) {
            throw new Exception(":)");
        }
        System.out.println(a);
    }
}
