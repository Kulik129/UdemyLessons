package org.example.core.lesson22.hw;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog("Ralf");
        System.out.println(dog.paw);
        Cat cat = new Cat("Elza");
        cat.sleep();
    }
}

