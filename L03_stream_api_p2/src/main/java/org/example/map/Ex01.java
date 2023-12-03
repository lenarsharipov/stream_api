package org.example.map;

import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdasda"); // length of all elements == 17

        // java.util.function -> Function<T, R>
        // Function<T, T> --> UnaryOperator<T>
        // Function<T, Boolean> --> Predicate<T>
        int result = list.stream()
                .map(String::length)
                .reduce(0, Integer::sum); // .reduce(0, (a, b) -> a + b);
                // 0 + 4 = 4
                // 4 + 6 = 10
                // 10 + 7 = 17
        System.out.println(result);
    }

}