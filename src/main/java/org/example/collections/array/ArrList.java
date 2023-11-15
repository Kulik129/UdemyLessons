package org.example.collections.array;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<>();
        arrList.add("Ivan");
        arrList.add("Vicktor");
        arrList.add("Katy");
        arrList.add("Dima");
        arrList.add("Olya");
        arrList.add("Ira");
        System.out.println(arrList.get(3)); // Dima

        // Создали массив с 200 элементами
        ArrayList<String> list = new ArrayList<>(200);
        list.add("Luda");
        System.out.println(list); // [Luda]

        // ArrayList с элементами другого ArrayList
        ArrayList<String> arrayList = new ArrayList<>(arrList); // [Ivan, Vicktor, Katy, Dima, Olya, Ira, Nina]
        arrayList.add("Nina");
        System.out.println(arrayList);
    }
}
