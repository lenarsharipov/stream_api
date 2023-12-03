package org.example.map;

import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> list = List.of("abcd", "qwerty", "asdasda"); // length of all elements == 17

        list.stream()
                .map(s -> new StringBuilder(s).reverse().toString()) // dcba, ytrewq ...
                .forEach(System.out::println);
    }
}
