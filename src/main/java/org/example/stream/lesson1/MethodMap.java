package org.example.stream.lesson1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("Hi");
        set.add("How are you?");
        set.add("Do your fine?");

        Set<Integer> list2 = set.stream().map(element -> element.length()).collect(Collectors.toSet());
        System.out.println(list2); // 5 2 12 13
    }
}
