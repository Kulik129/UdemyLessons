package org.example.stream.lesson14;

import org.example.stream.lesson2.Student;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MethodMinAndMax {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        List<Student> students = List.of(student1, student2, student3, student4, student5);

        Student min = students.stream().min((a, b) -> a.getAge() - b.getAge()).get();
        System.out.println(min);

        Student max = students.stream().max((a, b) -> a.getAge() - b.getAge()).get();
        System.out.println(max);
    }
}
