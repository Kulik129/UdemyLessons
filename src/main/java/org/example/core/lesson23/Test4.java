package org.example.core.lesson23;

public class Test4 {
    void abc(Animal a) {
        System.out.println("A");
    }
    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        Animal animal = new Mouse();
        test4.abc(animal); // A
        animal.getName(); // Mouse
    }
}
class Animal{
    void getName(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal {
    void getName(){
        System.out.println("Mouse");
    }
}
