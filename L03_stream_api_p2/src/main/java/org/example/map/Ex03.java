package org.example.map;

import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdasda"); // length of all elements == 17

        // Stream
        // map(Function)    Stream -> Stream
        // mapToInt(ToIntFunction) Stream -> IntStream
        // mapToLong(ToLongFunction) Stream -> LongStream
        // mapToDouble(ToDoubleFunction) Stream -> DoubleStream

        // IntStream
        // map(ToIntFunction) IntStream -> IntStream
        // mapToLong(IntToLongFunction) IntStream -> LongStream
        // mapToDouble(IntToDoubleFunction) IntStream -> DoubleStream
        // mapToObj(IntFunction) IntStream -> Stream
        int result = list.stream()
                .mapToInt(s -> s.length())   // 4, 6, 7  Stream -> IntStream
                .mapToObj(s -> s) // IntStream -> Stream: 4, 6, 7
                .mapToInt(s -> s)
                .sum();

        System.out.println(result);
    }
}
