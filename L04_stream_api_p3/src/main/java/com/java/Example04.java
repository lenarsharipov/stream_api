package com.java;

import java.util.Comparator;
import java.util.stream.Stream;

public class Example04 {

    public static void main(String[] args) {
        Stream<Dog> dogs = Stream.of(
                new Dog(3),
                new Dog(1),
                new Dog(5),
                new Dog(4),
                new Dog(2)
        );

//        Comparator<Dog> comparator = (d1, d2) -> d1.getAge() - d2.getAge();
        Comparator<Dog> comparator = Comparator.comparingInt(Dog::getAge);
        dogs.sorted(comparator)
                .forEach(System.out::println);
    }

}
