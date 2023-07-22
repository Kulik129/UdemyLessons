package org.example.lesson13;

import org.example.lesson11.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student st = new Student("Ivan",3,4.4);
        Student st2 = new Student("Ivan",3,4.4);
        method2(st,st2);
    }
    public static void method1(Student student1, Student student2){
        if (student1.name.equals(student2.name) && student2.grade == student2.grade && student1.course == student2.course){
            System.out.println("Студенты идентичны");
        }
    }

      static void method2(Student student1, Student student2){
        method1(student1,student2);
        if (student1.name.equals(student2.name)){
            if (student1.course == student2.course){
                System.out.println("Имена студентов и курс студентов одинков");
            } else if (student1.grade == student2.grade){
                System.out.println("Имена студентов и отценка одинаковы");
            } else {
                System.out.println("Имена одинаковы");
            }
        }
    }
}
