package org.example.core.lesson24.hw;

public interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks");
    }
}
