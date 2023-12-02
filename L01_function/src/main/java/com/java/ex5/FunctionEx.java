package com.java.ex5;

import java.util.function.Function;

public class FunctionEx {
    public static void main(String[] args) {
        Function<String, Integer> f1 = s -> s.length();
        int x = f1.apply("Hello"); // 6
        System.out.println(x);
    }
}
