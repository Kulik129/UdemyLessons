package org.example.stream.lesson4;

import java.util.List;

public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 5, 3, 4, 5, 2, 6);
        int res = integers.stream().reduce((a, b) -> a * b).get();
        System.out.println(res);
    }
}
