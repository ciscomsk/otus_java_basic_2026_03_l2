package ru.otus.java.basic;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        demo();
    }

    public static void demo() {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
        // =
        System.out.println("-----");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println("-----");
    }
}
