package org.example.core.lesson29.var.lambda2;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("hi", "by", "lol", "KEK");
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-------------------------------------");
        list.forEach(s -> System.out.println(s));
        System.out.println("-------------------------------------");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(133);
        arrayList.add(2);
        arrayList.add(334);
        arrayList.add(4);
        arrayList.add(53);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(458);
        arrayList.add(9);

        arrayList.removeIf(el -> el % 3 == 0);
        System.out.println(arrayList);

        arrayList.sort((x, y) -> x.compareTo(y)); // сортировка по возрастанию
        arrayList.sort((x, y) -> -x.compareTo(y)); // сортировка по убыванию
        System.out.println(arrayList);

    }
}
