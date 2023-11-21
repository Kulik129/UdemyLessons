package org.example.core.lesson24.hw;

abstract public class Bird extends Animal implements Speakable {
    public Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println("Sings" + name);
    }
}
