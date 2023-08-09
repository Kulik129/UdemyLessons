package org.example.lesson23;

public class Test3 {
    public static void main(String[] args) {
        Teacherr t = new Teacherr();
        t.eat(); // учитель поел вкусную гречу
        Employy ee = new Employy();
        ee.eat(); // я поел
    }
}
class Employy {
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("я поел");
    }

    void sleep() {
        System.out.println("Спать");
    }
}
class Teacherr extends Employy {
    String name;
    @Override
    void eat() {
        System.out.println("учитель поел вкусную гречу");
    }
}