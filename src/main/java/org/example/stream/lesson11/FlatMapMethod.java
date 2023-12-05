package org.example.stream.lesson11;

import org.example.stream.lesson2.Student;

import java.util.ArrayList;
import java.util.List;

public class FlatMapMethod {
    public static void main(String[] args) {

        Student student1 = new Student("Mariya", 'f', 18, 4, 4.1);
        Student student2 = new Student("Nikolay", 'm', 23, 4, 8.4);
        Student student3 = new Student("Viktor", 'm', 20, 2, 7.4);
        Student student4 = new Student("Ivan", 'm', 24, 1, 3.4);
        Student student5 = new Student("Dmitrii", 'm', 19, 4, 4.4);

        Faculty faculty1 = new Faculty("Economic");
        Faculty faculty2 = new Faculty("Mathematics");

        faculty1.add(student1);
        faculty1.add(student2);
        faculty1.add(student3);
        faculty2.add(student4);
        faculty2.add(student5);

        List<Faculty> faculties = new ArrayList<>();
        faculties.add(faculty1);
        faculties.add(faculty2);

        faculties.stream().flatMap(faculty -> faculty.getStudentsOfFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));
    }

    public static class Faculty {
        String name;
        List<Student> studentsOfFaculty;

        public Faculty(String name) {
            this.name = name;
            studentsOfFaculty = new ArrayList<>();
        }

        public List<Student> getStudentsOfFaculty() {
            return studentsOfFaculty;
        }

        public void add(Student student) {
            studentsOfFaculty.add(student);
        }
    }
}

