package ru.otus.java.basic;

import java.util.List;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        demo();
        demo2();
    }

    public static void demo() {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
        // =
        System.out.println("-----");
        IntStream.rangeClosed(1, 4).forEach(System.out::println);
        System.out.println("-----11");
    }

    public static void demo2() {
        System.out.println(1);
        System.out.println("-----");
        List.of(1, 2, 8).forEach(i -> System.out.println("---" + i));
        System.out.println("-----");
    }

    public static void demo3() {
        System.out.println("000-");
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println("000-");
    }
}
