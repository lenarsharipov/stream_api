package com.java.ex7;

import java.util.function.Predicate;

public class PredicateEx {
    public static void main(String[] args) {
        Predicate<Integer> predicate = el -> el % 2 == 0 && el > 0;
        boolean result = predicate.test(13);
        boolean result2 = predicate.test(-2);
        boolean result3= predicate.test(16);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
