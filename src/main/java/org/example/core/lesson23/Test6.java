package org.example.core.lesson23;

public class Test6 {
}

class Animals {
    String showName() {
        return "some animal";
    }
    void showInfo() {
        System.out.println("Name of animal: " + showName());
    }
}

class Rabbit extends Animals {
    @Override
    String showName() {
        return "rabbit";
    }

    public static void main(String[] args) {
        Animals animals = new Rabbit(); // Создается объект типа Rabbit
        animals.showInfo(); // Name of animal: rabbit
    }
}
