package com.java.ex3;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerBiConsumer {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 20, 30, 40);
        Consumer<Integer> listConsumer = System.out::println;
        list.forEach(listConsumer);

        System.out.println("*".repeat(80));

        Map<Integer, String> map = Map.of(
                10, "A",
                20, "B",
                30, "C"
        );
        BiConsumer<Integer, String> mapBiConsumer = (k, v) -> System.out.println(k + " : " + v);
        map.forEach(mapBiConsumer);

    }
}
