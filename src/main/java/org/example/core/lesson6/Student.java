package org.example.core.lesson6;

public class Student {
    int id;
    int course;
    String name;
    String surname;

    Student(int i, int c, String n, String s) {
        id = i;
        course = c;
        name = n;
        surname = s;
    }

    Student(int i, int c){
        id = i;
        course = c;
    }

    Student(int i){
        id = i;
    }
    Student(){
    }
}
