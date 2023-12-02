package com.java.ex8;

import java.util.function.BinaryOperator;

public class BinaryOperatorEx {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        int result = binaryOperator.apply(11, 22);
        System.out.println(result);
    }
}
