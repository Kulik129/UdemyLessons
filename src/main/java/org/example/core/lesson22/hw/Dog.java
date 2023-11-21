package org.example.core.lesson22.hw;

public class Dog extends Pet {
    Dog(String name) {
        this.name = name;
        System.out.println("I`m dog and my name is " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
