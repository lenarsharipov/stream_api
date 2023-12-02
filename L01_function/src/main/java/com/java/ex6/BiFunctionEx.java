package com.java.ex6;

import java.util.function.BiFunction;

public class BiFunctionEx {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, String> biFunction = (a, b) -> a + "" + b;
        String result = biFunction.apply(10, 333);
        System.out.println(result);
    }
}
