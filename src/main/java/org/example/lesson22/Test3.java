package org.example.lesson22;

public class Test3 {
    public static void main(String[] args) {
        Dok dok = new Dok();
        dok.name = "Ivan";
        dok.age = 23;
        dok.lechit();

    }
}

class Employ {
    String name;
    int age;
    int expiriense;

    void eat() {
        System.out.println("я поел");
    }

    void sleep() {
        System.out.println("Спать");
    }
}

class Dok extends Employ {

    void lechit() {
        System.out.println("Лечу");
    }
}

class Teacher extends Employ {
    String name;

    void uchit() {
        System.out.println("Учу");
    }
}
