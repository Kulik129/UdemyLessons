package org.example.lesson29;

import java.util.ArrayList;

public class Test {

}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
}


class StudentInfo {
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

        StudentInfo studentInfo = new StudentInfo();

//        studentInfo.testStudents(list, (Student st) -> {
//            return st.avgGrade > 6;
//        });
//
//        studentInfo.testStudents(list, (Student st) -> {
//            return st.age > 24;
//        });


        // Одинаковое написание и одинаков  вывод
        studentInfo.testStudents(list, st -> st.course > 2);
        studentInfo.testStudents(list, (Student s) -> {
            return s.course > 2;
        });
    }

    void printStudent(Student student) {
        System.out.println("Name " + student.name + " Sex " + student.sex + " Age " + student.age + " Course " + student.course + " Grade " + student.avgGrade);
    }

    void testStudents(ArrayList<Student> studentArrayList, StudentChecks sc) {
        for (Student student : studentArrayList) {
            if (sc.test(student)) {
                printStudent(student);
            }
        }
    }
}

interface StudentChecks {
    boolean test(Student s);
}