package com.java.ex4;

import java.util.Random;

public class SupplierEx {

    public static void main(String[] args) {
        java.util.function.Supplier<Integer> supplier = () -> new Random().nextInt(1000); // [0, 999]
        Integer result = supplier.get();
        System.out.println(result);
    }
}
