package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        // Добавление элементов
        map.put(1000, "Nikolay");
        map.put(3465, "Viktor");
        map.put(1254, "Alex");
        map.put(8711, "Bob");
        map.put(3209, "Tom");
        map.put(3943, "Alli");
        map.put(7733, "Polli");
        map.put(null, "lili");
        map.put(1111, null);

        System.out.println(map);

        // Добавление элемента если такого элемента нет
        map.putIfAbsent(1234, "Gloriya");
        map.putIfAbsent(7733, "Polli");

        // Получить по ключу
        System.out.println(map.get(3943));

        // Удаление
        map.remove(1111);

        // true если есть значение по ключу
        boolean res = map.containsKey(1000);
        System.out.println(res);

        // true если есть значение по значению
        boolean resVal = map.containsValue("Bob");
        System.out.println(resVal);

        // Множество всех ключей
        System.out.println(map.keySet());

        // Множество всех ключей
        System.out.println(map.values());
    }
}
