package com.java.example1;

import java.util.stream.Stream;

public class Example2 {
    // for example, we have a method returning Stream.
    // To avoid returning null, we may return an empty stream
    public static Stream<Integer> m1() {
        // some action
        return Stream.empty();
    }

    public static void main(String[] args) {
        // used generally to avoid a null value
        Stream<Integer>  sq = Stream.empty();

    }
}
