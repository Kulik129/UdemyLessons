package org.example.stream.lesson7;

import java.util.stream.Stream;

public class MethodConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(3,6,1,27,4,9);
        Stream<Integer> stream2 = Stream.of(7,4,5,8);
        Stream<Integer> stream4 = Stream.concat(stream1, stream2);

        stream4.forEach(System.out::println);
    }
}
