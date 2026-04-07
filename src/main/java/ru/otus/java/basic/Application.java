package ru.otus.java.basic;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        demo2();
    }

    public static void demo2() {
        System.out.println("-----");
        IntStream.rangeClosed(1, 3).forEach(i -> System.out.println("---" + i));
        System.out.println("-----");
    }
}
