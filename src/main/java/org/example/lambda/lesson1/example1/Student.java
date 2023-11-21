package org.example.lambda.lesson1.example1;


public class Student {
    String name;
    char sex;
    int age;
    int course;
    double avGrade;

    public Student(String name, char sex, int age, int course, double avGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avGrade = avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avGrade=" + avGrade +
                '}';
    }
}
