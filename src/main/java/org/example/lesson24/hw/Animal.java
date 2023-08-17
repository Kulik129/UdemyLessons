package org.example.lesson24.hw;

abstract public class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }
    abstract void sleep();
    abstract void eat();
}
