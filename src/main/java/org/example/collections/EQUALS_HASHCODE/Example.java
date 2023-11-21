package org.example.collections.EQUALS_HASHCODE;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Example {
    public static void main(String[] args) {
        // Если переопределили equals, то и переопредели и hashcode
        // Сравнение в HashMap сначала идет по hashcode а потом по equals

        Student student1 = new Student("Dmitrii", "Kulik", 4);
        Student student2 = new Student("Viktor", "Nikolaev", 3);
        Student student3 = new Student("Vasilii", "Fedorov", 1);
        Map<Student, Double> map = new HashMap<>();

        map.put(student1, 4.4);
        map.put(student2, 3.4);
        map.put(student3, 4.2);

        System.out.println(map);

        // Если не переопределен hashcode результат нахождения в мапе такого же студента с таким же ключем
        // будет выдавать false
        // даже если equals будет true
        Student student4 = new Student("Dmitrii", "Kulik", 4);
        map.put(student4, 4.4);
        boolean res = map.containsKey(new Student("Dmitrii", "Kulik", 4));

        System.out.println("res: " + res); // res: false
        System.out.println(student1.equals(student4)); // true
        System.out.println("Значения hashCode: ");
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());
        System.out.println(student4.hashCode());

        // Перебирает мапу
        System.out.println();
        for (Map.Entry<Student, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }

    public static class Student  implements  Comparable<Student>{
        String name;
        String surname;
        int course;


        public Student(String name, String surname, int course) {
            this.name = name;
            this.surname = surname;
            this.course = course;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", surname='" + surname + '\'' +
                    ", course=" + course +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Student student = (Student) o;
            return course == student.course && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, surname, course);
        }

        // Переопределили по имени
        @Override
        public int compareTo(Student o) {
            return this.name.compareTo(o.name);
        }
    }
}

