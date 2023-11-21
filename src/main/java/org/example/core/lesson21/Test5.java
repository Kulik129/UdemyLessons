package org.example.core.lesson21;

import java.util.HashMap;
import java.util.Map;

public class Test5 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mikhail");
        map.put(778, "Tregulov Zaur");
        map.put(779, "Petrov");
        map.remove(777);

        System.out.println(map.get(778));
    }
}
