package org.example.lesson24.hw;

abstract public class Mammal extends Animal implements Speakable{
    public Mammal(String name){
        super(name);
        this.name = name;
    }
    abstract void run();
}
