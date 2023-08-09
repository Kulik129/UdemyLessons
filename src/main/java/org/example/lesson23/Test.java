package org.example.lesson23;

public class Test {
    public static void main(String[] args) {
        Dok dok = new Dok();
        Teacher teacher = new Teacher();

        // Teacher teacher1 = new Employ(); // так не работает
        Employ teacher2 = new Teacher();  // Переменная супер класса может ссылка на объект саб класса но не наоборот
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
