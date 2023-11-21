package org.example.core.lesson24.hw;

abstract public class Fish extends Animal{
    public Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep(){
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
    abstract void swim();
}
