package com.java.ex1;

public class Example1 {
    public static void main(String[] args) {
        Eatable e1 = new Eatable() {
            @Override
            public void eat() {
                System.out.println("hap hap");
            }
        };

        Eatable e2 = () -> System.out.println("hap hap");
        e2.eat();
        e2.drink();
    }
}
