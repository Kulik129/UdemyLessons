package org.example.collections.map;

import org.example.collections.EQUALS_HASHCODE.Example;

import java.util.LinkedHashMap;

public class ExampleLinkedHashMap {
    public static void main(String[] args) {
        // Значения хранятся в той же последовательности в которой были добавлены
        LinkedHashMap<Double, Example.Student> linkedHashMap = new LinkedHashMap<>();
        Example.Student student1 = new Example.Student("Vika", "Filatova", 3);
        Example.Student student2 = new Example.Student("Nikolay", "Bulanov", 3);
        Example.Student student3 = new Example.Student("Misha", "Belov", 3);
        Example.Student student4 = new Example.Student("Alena", "Frolova", 3);

        linkedHashMap.put(4.7, student4);
        linkedHashMap.put(3.3, student1);
        linkedHashMap.put(3.7, student2);
        linkedHashMap.put(4.4, student3);

        System.out.println(linkedHashMap);
    }
}
