package com.java;

import java.util.List;

public class Example05 {

    public static void main(String[] args) {
        // skip()
        // peek()
        // takeWhile()
        // dropWhile()

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // skip()
        list.stream()
                .skip(4) // skips first 4 elems and starts with 5.
                .forEach(System.out::println);

        System.out.println("*".repeat(50));

        // limit()
        list.stream()
                .limit(4) // limits source with first 4 elems -> 1, 2, 3, 4.
                .forEach(System.out::println);

        System.out.println("*".repeat(50));

        // peek()
        list.stream()
                .peek(el -> System.out.println(el))
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        System.out.println("*".repeat(50));

        // takeWhile() == while(condition)
        List<Integer> list2 = List.of(1, 2, 3, 50, 70, 100, 130);
        list2.stream()
//                .takeWhile(n -> n <= 100) // 1, 2, 3, 50, 70, 100
                .takeWhile(n -> n % 2 == 0) // void
                .forEach(System.out::println);

        System.out.println("*".repeat(50));

        System.out.println("dropWhile()");
        List<Integer> list3 = List.of(1, 2, 120, 50, 70, 100, 130);
        // dropWhile(). Opposite to takeWhile()
        list3.stream()
                .dropWhile(n -> n <= 100) // -> [120, 50, 70, 100, 130]
                .forEach(System.out::println);

    }

}