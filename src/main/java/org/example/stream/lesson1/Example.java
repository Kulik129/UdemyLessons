package org.example.stream.lesson1;

import java.util.*;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("vfdvdfvdfv");
        list.add("gfdf");
        list.add("hjthrt");
        list.add("vfdvdwfwfvdfv");
        list.add("wfwfwfewfwefwefwefw");

        for (int i = 0; i < list.size(); i++) {
            list.set(i, String.valueOf(list.get(i).length()));
        }
        System.out.println(list); // Заменили слова на длину каждого [10, 4, 6, 13, 19]

        // Методы стрима не меняют лист или массив на котором были вызваны


        // map() преобразует каждый эл. потока как мы опишем в параметре map
        list.stream().map(el -> el.length())
                .collect(Collectors.toList());
        System.out.println(list); // Длина символов [10, 4, 6, 13, 19]

        int[] arr = {1, 2, 3, 4, 5};
        arr = Arrays.stream(arr).map(el -> {
            if (el % 3 == 0) {
                el = el / 3;
            }
            return el;
        }).toArray();
        System.out.println(Arrays.toString(arr));

        Set<String> set = new TreeSet<>();
        set.add("vfdvdfvdfv");
        set.add("gfdf");
        set.add("hjthrt");
        set.add("vfdvdwfwfvdfv");
        set.add("wfwfwfewfwefwefwefw");

        System.out.println(set);

        Set<Integer> set2 = set.stream().map(el -> el.length()).collect(Collectors.toSet());
        List<Integer> lis3 = set.stream().map(e -> e.length()).collect(Collectors.toList());

        System.out.println(set2);
        System.out.println(lis3);
    }
}
