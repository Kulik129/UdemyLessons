package org.example.core.lesson26;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "V8");
        Car car2 = new Car("Red", "V8");
        Car car3 = new Car("Black", "V6");
        System.out.println(car1.equals(car2));

        ArrayList<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        Car car4 = new Car("Black", "V6");
        System.out.println(list.contains(car4));

        System.out.println(car4.toString());
    }
}

class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            Car car = (Car) obj;
            return (color.equals(car.color) && engine.equals(car.engine));
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }


}
