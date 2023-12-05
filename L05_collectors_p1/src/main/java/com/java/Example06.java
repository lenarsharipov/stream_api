package com.java;

import java.util.List;
import java.util.stream.Collectors;

public class Example06 {
    public static void main(String[] args) {
        List<String> list = List.of("AAA", "B", "CCCCC", "DDD", "FFFFFF", "AAA");

        var res =
                list.stream()
                        .collect(Collectors.teeing(
                                Collectors.counting(), // number of elements in list - > 6
                                Collectors.joining(), // string composed of all list elements joined all together -> AAABCCCCCDDDFFFFFFAAA
                                List::of // == (count, finalStr) -> List.of(count, finalStr)
                        ));

        System.out.println(res);

    }
}
