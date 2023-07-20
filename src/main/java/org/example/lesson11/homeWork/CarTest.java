package org.example.lesson11.homeWork;

public class CarTest {
    public static void main(String[] args) {
        Car car = new Car("red", "V8", 2);
        Car car1 = new Car("black", "v4", 3);
        // Изменить к-во дверей
        System.out.println("К-во дверей было в конструкторе " + car.quantityDoors);
        int s = car.changeQuantityDoors(4);
        System.out.println("Количество дверей было передано для замены " + s);
        System.out.println("Количество дверей стало " + car.quantityDoors);
        // Поменять цвет местами
        car1.changeColor(car, car1);
        System.out.println(car1.color);
    }
}
