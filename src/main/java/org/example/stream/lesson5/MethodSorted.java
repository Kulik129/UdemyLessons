package org.example.stream.lesson5;


import org.example.stream.lesson2.Student;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodSorted {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Mariya", 'f', 18, 4, 4.1),
                new Student("Nikolay", 'm', 23, 4, 8.4),
                new Student("Viktor", 'm', 20, 2, 7.4),
                new Student("Ivan", 'm', 24, 1, 3.4),
                new Student("Dmitrii", 'm', 19, 4, 4.4)
        );
        List<Student> studentList = sortStu(students);
        System.out.println(studentList);
    }

    /**
     * Сортировка массива чисел.
     * @param arr Массив чисел.
     * @return Отсортированный массив чисел.
     */
    public static int[] sort(int[] arr) {
        arr = Arrays.stream(arr)
                .sorted()
                .toArray();
        return arr;
    }

    /**
     * Сортировка студентов по имени.
     * @param students Лист студентов.
     * @return Отсортированный лист со студентами.
     */
    public static List<Student> sortStu(List<Student> students) {
        students = students
                .stream()
                .sorted((x, y) -> x.getName().compareTo(y.getName())
                )
                .collect(Collectors.toList());
        return students;
    }
}
