package com.java.ex8;

import java.util.function.UnaryOperator;

public class UnaryOperatorEx {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = n -> n * 3;
        int result = unaryOperator.apply(11);
        System.out.println(result);
    }
}
