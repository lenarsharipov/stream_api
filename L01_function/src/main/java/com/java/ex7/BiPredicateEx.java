package com.java.ex7;

import java.util.function.BiPredicate;

public class BiPredicateEx {
    public static void main(String[] args) {
        BiPredicate<String, Integer> p = (s, i) -> s.length() == i;
        boolean result1 = p.test("hello", 5);
        boolean result2 = p.test("hello", 2);

        System.out.println(result1);
        System.out.println(result2);
    }
}