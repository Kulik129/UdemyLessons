package org.example.collections.linkedList;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {

        LinkedList<Student2> students = new LinkedList<>();

        students.add(new Student2("Ivan", 2));
        students.add(new Student2("Nikolay", 1));
        students.add(new Student2("Elena", 2));
        students.add(new Student2("Petr", 3));
        students.add(new Student2("Mariya", 4));

        System.out.println(students);
        System.out.println(students.get(2));
    }
    public static class Student2 {
        String name;
        int course;

        public Student2(String name, int course) {
            this.name = name;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student2{" +
                    "name='" + name + '\'' +
                    ", course=" + course +
                    '}';
        }
    }
}
