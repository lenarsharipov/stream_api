package com.java.ex1;

@FunctionalInterface
public interface Eatable {

    void eat();

    default void drink() {
        System.out.println("drink");
    }

}
