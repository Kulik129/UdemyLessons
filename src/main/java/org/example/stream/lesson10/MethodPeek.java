package org.example.stream.lesson10;

import java.util.stream.Stream;

public class MethodPeek {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3,4,5,6);
        System.out.println(stream.distinct().peek(System.out::println).count());
    }
}
