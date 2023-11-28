package org.example.stream.lesson1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example1 {
    // Java Stream API предоставляет удобные и мощные инструменты для работы с коллекциями данных.
    // С помощью Stream API можно выполнять различные операции над данными, такие как
    // фильтрация, отображение, сортировка, сведение и другие, с использованием функциональных стилей программирования.


    // Вот несколько основных операций Stream API с примерами:


    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        // ANSI-коды для цветов в консоли
        List<String> names = Arrays.asList("John", "Jane", "Doe", "Alice");

        // Фильтрация и вывод имен, начинающихся с D
        System.out.println(ANSI_GREEN + "\n--- Фильтрация и вывод имен, начинающихся с \"D\" ---" + ANSI_RESET);
        names.stream()
                .filter(n -> n.startsWith("D"))
                .forEach(System.out::println);

        // Преобразование имен в верхний регистр и вывод
        System.out.println(ANSI_GREEN + "\n--- Преобразование имен в верхний регистр и вывод ---" + ANSI_RESET);
        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        // Сортировка и вывод имен в алфавитном порядке
        System.out.println(ANSI_GREEN + "\n--- Сортировка и вывод имен в алфавитном порядке ---" + ANSI_RESET);
        names.stream()
                .sorted()
                .forEach(System.out::println);

        // Вывод имен, содержащих букву e
        System.out.println(ANSI_GREEN + "\n--- Вывод имен, содержащих букву \"e\" ---" + ANSI_RESET);
        names.stream()
                .filter(name -> name.contains("e"))
                .forEach(System.out::println);

        // Группировка имен по первой букве
        System.out.println(ANSI_GREEN + "\n--- Группировка имен по первой букве ---" + ANSI_RESET);
        Map<Character, List<String>> groupedNames = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println("Grouped Names: " + groupedNames);

        // Сложение всех чисел
        System.out.println(ANSI_GREEN + "\n--- Сложение всех чисел ---" + ANSI_RESET);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int sum = numbers.stream()
                .reduce(0, Integer::sum);
        System.out.println("Sum: " + sum);

        System.out.println(ANSI_GREEN + "\n--- Преобразование имен в нижний регистр и вывод ---" + ANSI_RESET);
        names.stream()
                .map(name -> name.toLowerCase())
                .forEach(System.out::println);

        System.out.println(ANSI_GREEN + "\n--- Вывод имен, содержащих букву \"e\" разными цветами ---" + ANSI_RESET);
        names.stream().filter(name -> name.contains("e")).forEach(name -> {
            if (name.startsWith("D")) {
                System.out.println(ANSI_YELLOW + name + ANSI_RESET); // желтый цвет для имен, начинающихся с "J"
            } else if (name.startsWith("K")) {
                System.out.println(ANSI_GREEN + name + ANSI_RESET);  // зеленый цвет для имен, начинающихся с "A"
            } else if (name.startsWith("R")) {
                System.out.println(ANSI_BLUE + name + ANSI_RESET);   // синий цвет для имен, начинающихся с "D"
            } else {
                System.out.println(ANSI_RED + name + ANSI_RESET);    // красный цвет для остальных имен
            }
        });
    }
}
