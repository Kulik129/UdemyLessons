package org.example.core.lesson24.hw;

public class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    public void swim(){
        System.out.println("Меченосец красивая рыба");
    }
    public void eat(){
        System.out.println("Меченосец не хищная рыба");
    }
}
