package org.example.collections.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("Next");
        strings.add("Mi");
        strings.add("Redmi");
        strings.add("Samsung");
        strings.add("Apple");
        strings.add("Oppo");
        strings.add("Vivo");

        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }


}
