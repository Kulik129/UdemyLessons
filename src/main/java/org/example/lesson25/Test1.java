package org.example.lesson25;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        Emplo em = new Doc();
        Emplo em1 = new Teach();
        Emplo em2 = new Dri();
        Doc doc = (Doc) em; // Кастим переменную. Мы говорим компилятору, чтобы он поверил, что em это на самом деле доктор
        System.out.println(doc.spec); // khirurg
    }
}

class Emplo {
    double salary = 100;
    String name = "Tom";
    int age;
    int expiriense;

    void eat() {
        System.out.println("Eat");
    }

    void sleep() {
        System.out.println("Sleep");
    }
}

class Doc extends Emplo {
    String spec = "khirurg";

    void lecit() {
        System.out.println("Lechit");
    }
}

class Teach extends Emplo {
    int count;

    void count() {
        System.out.println("Count");
    }
}

class Dri extends Emplo {
    int poezdki;

    void drive() {
        System.out.println("Drive");
    }
}
