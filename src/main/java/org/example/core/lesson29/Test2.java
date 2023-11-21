package org.example.core.lesson29;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student student1 = new Student("Ivan", 'm', 23, 2, 4.5);
        Student student2 = new Student("Vasilii", 'm', 22, 1, 6.6);
        Student student3 = new Student("Nikolai", 'm', 25, 3, 7.8);
        Student student4 = new Student("Viktor", 'm', 21, 2, 6.5);
        Student student5 = new Student("Stepan", 'm', 20, 1, 9);

        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);

        for (Student student : list) {
            System.out.println(student.name);
        }
        System.out.println("------------------------------------------------");
        list.removeIf(x -> x.name.endsWith("i"));

        for (Student student : list) {
            System.out.println(student.name);
        }
        System.out.println("------------------------------------------------");
    }
}
