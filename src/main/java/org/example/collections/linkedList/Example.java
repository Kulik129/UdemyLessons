package org.example.collections.linkedList;

import java.util.LinkedList;

public class Example {
    public static void main(String[] args) {
        Student2 student1 = new Student2("Ivan", 2);
        Student2 student2 = new Student2("Nikolay", 1);
        Student2 student3 = new Student2("Elena", 2);
        Student2 student4 = new Student2("Petr", 3);
        Student2 student5 = new Student2("Mariya", 4);

        LinkedList<Student2> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

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
