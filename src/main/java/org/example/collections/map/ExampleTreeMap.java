package org.example.collections.map;

import org.example.collections.EQUALS_HASHCODE.Example;

import java.util.Map;
import java.util.TreeMap;

public class ExampleTreeMap {
    public static void main(String[] args) {
        // В TreeMap значения хранятся по возрастанию(по ключу)
        // Значения в TreeMap могут быть не уникальными
        // Ключи должны быть уникальными, как и в HashMap
        // для сортировки по ключу Example.Student в классе Student нужно импл Comparable и переопределить compareTo
        TreeMap<Double, Example.Student> studentTreeMap = new TreeMap<>();
        Example.Student student1 = new Example.Student("Vika", "Filatova", 3);
        Example.Student student2 = new Example.Student("Nikolay", "Bulanov", 3);
        Example.Student student3 = new Example.Student("Misha", "Belov", 3);
        Example.Student student4 = new Example.Student("Alena", "Frolova", 3);
        Example.Student student5 = new Example.Student("Nastya", "Violova", 3);
        Example.Student student6 = new Example.Student("Katya", "Loginova", 3);
        Example.Student student7 = new Example.Student("Nikita", "Dostafeev", 3);
        Example.Student student8 = new Example.Student("Sasha", "Abramom", 3);

        studentTreeMap.put(4.7, student4);
        studentTreeMap.put(4.1, student7);
        studentTreeMap.put(4.9, student8);
        studentTreeMap.put(3.3, student1);
        studentTreeMap.put(3.7, student2);
        studentTreeMap.put(4.4, student3);
        studentTreeMap.put(4.2, student5);
        studentTreeMap.put(4.3, student6);


        for (Map.Entry<Double, Example.Student> studentEntry : studentTreeMap.entrySet()) {
            System.out.println("Key: "+ studentEntry.getKey() + "  " + "Val: "+studentEntry.getValue());
        }
        System.out.println();

        // Развернуть в обратную сторону, вывести в обратной последовательности  "descendingMap()"
        for (Map.Entry<Double, Example.Student> studentEntry : studentTreeMap.descendingMap().entrySet()) {
            System.out.println("Key: "+ studentEntry.getKey() + "  " + "Val: "+studentEntry.getValue());
        }
        System.out.println();

        // Вывести значения выше заданных "tailMap(4.3)"
        for (Map.Entry<Double, Example.Student> studentEntry : studentTreeMap.tailMap(4.3).entrySet()) {
            System.out.println("Key: "+ studentEntry.getKey() + "  " + "Val: "+studentEntry.getValue());
        }
        System.out.println();

        //Вывести значения ниже заданных "headMap(4.4)"
        for (Map.Entry<Double, Example.Student> studentEntry : studentTreeMap.headMap(4.4).entrySet()) {
            System.out.println("Key: "+ studentEntry.getKey() + "  " + "Val: "+studentEntry.getValue());
        }
        System.out.println();

        // Вывести последний элемент с конца
        System.out.println(studentTreeMap.lastEntry());
        System.out.println();

        // Вывести первый элемент с конца
        System.out.println(studentTreeMap.firstEntry());
    }
}
