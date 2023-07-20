package org.example.lesson11.homeWork;

public class Car {
    String color;
    String engine;
    int quantityDoors;

    public Car(String color, String engine, int quantityDoors) {
        this.color = color;
        this.engine = engine;
        this.quantityDoors = quantityDoors;
    }

    public int changeQuantityDoors(int quantity) {
        quantityDoors = quantity;
        return quantityDoors;
    }

    public int changeQuantityDoorsNo(int quantity) {
        quantity = quantity;
        return quantity;
    }

    public void changeColor(Car c1, Car c2) {
        String s = c1.color;
        c1.color = c2.color;
        c2.color = s;
    }
}
