package org.example.core.lesson22.hw;

public class Cat extends Pet {
    Cat(String name) {
        this.name = name;
        System.out.println("I`m cat and my name is: " + name);
    }


    public void sleep() {
        System.out.println("Cat " + name + " sleeps");
    }
}
