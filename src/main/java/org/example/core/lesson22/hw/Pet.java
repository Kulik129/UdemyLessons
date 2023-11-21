package org.example.core.lesson22.hw;

public class Pet extends Animal {
    Pet() {
        System.out.println("I`m pet");
    }

    int eyes;
    String name;
    int tails = 1;
    int paw = 4;

    public void run() {
        System.out.println("Pet runs");
    }

    public void jump() {
        System.out.println("Pet jumps");
    }
}
