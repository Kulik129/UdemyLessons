package org.example.lambda.lesson1.example1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentInfo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mariya", 'f', 18, 4, 4.1));
        students.add(new Student("Nikolay", 'm', 23, 4, 8.4));
        students.add(new Student("Viktor", 'm', 20, 2, 7.4));
        students.add(new Student("Ivan", 'm', 24, 1, 3.4));
        students.add(new Student("Dmitrii", 'm', 19, 4, 4.4));

        StudentInfo info = new StudentInfo();
        /*
        // Сортировка студентов по курсу
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course; // Определяем сортировку по курсу
            }
        });
        */
        // Сортировка студентов по курсу с лямбдой
        Collections.sort(students, (st1, st2) -> st1.course-st2.course);  // Определяем сортировку по курсу

        System.out.println(students);

        /*
        info.testStudents(students, new StudentCheck() {
            @Override
            public boolean check(Student student) {
                return student.sex == 'f';
            }
        });
        System.out.println("---------------------------------------------------");
        // Лямбда выражение с таким же функционалом как выше
        info.testStudents(students, p -> p.sex == 'f');

        // Использование анонимного класса
        info.testStudents(students, new StudentCheck() {
            @Override
            public boolean check(Student student) {
                return student.age < 20;
            }
        });
        System.out.println("---------------------------------------------------");
       // Лямбда выражение с таким же функционалом как выше
        info.testStudents(students,param -> param.age < 20);
        System.out.println("---------------------------------------------------");
        info.testStudents(students, student -> student.avGrade < 4);
        System.out.println("---------------------------------------------------");

        */
    }

    public void testStudents(ArrayList<Student> students, StudentCheck studentCheck) {
        for (Student student : students) {
            if (studentCheck.check(student)) {
                System.out.println(student);
            }
        }
    }
}
