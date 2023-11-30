package org.example.stream.lesson6;

import org.example.stream.lesson2.Student;

import java.util.Arrays;
import java.util.List;

public class MethodChaining {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Mariya", 'f', 18, 4, 4.1),
                new Student("Nikolay", 'm', 23, 4, 8.4),
                new Student("Viktor", 'm', 20, 2, 7.4),
                new Student("Ivan", 'm', 24, 1, 3.4),
                new Student("Dmitrii", 'm', 19, 4, 4.4)
        );
        students.stream()
                .map(el -> {
                    el.setName(el.getName().toUpperCase());
                    return el;
                })
                .filter(el -> el.getSex() == 'm')
                .sorted((e, y) ->
                        e.getCourse() - y.getCourse()
                )
                .forEach(System.out::println);
    }

}
