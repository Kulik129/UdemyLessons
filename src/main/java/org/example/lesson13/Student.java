package org.example.lesson13;

public class Student {
    int grade;

    Student(int grade){
        this.grade = grade;
    }
}
class StudentNew{
    public static void main(String[] args) {
        Student student = new Student(51);
        switch (student.grade){
            case 3:
                System.out.println("троечник");
                break;
            case 4:
                System.out.println("хорошис");
                break;
            case 5:
                System.out.println("отличник");
                break;
            default:
                System.out.println("что-то не так");
        }
    }
}