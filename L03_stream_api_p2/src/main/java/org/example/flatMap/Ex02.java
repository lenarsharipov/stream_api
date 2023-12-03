package org.example.flatMap;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> list = List.of("ab4n3kdk4", "2n3n2nnm", "mko", "102a");  // 9 digits

        String digits = "0123456789";

        long digitsInString = list.stream()
                .flatMap(s -> Arrays.stream(s.split("")))
                .filter(digits::contains)
                .count(); // returns long

        System.out.println(digitsInString);
    }
}
