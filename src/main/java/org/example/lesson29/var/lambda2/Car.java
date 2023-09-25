package org.example.lesson29.var.lambda2;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Car {
    String mode;
    String color;
    double engine;

    public Car(String mode, String color, double engine) {
        this.mode = mode;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mode='" + mode + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}

class Test10 {
    public static ArrayList<Car> createThreeCars(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }

    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        ArrayList<Car> out = createThreeCars(() -> new Car("Lamborghini Urus", "dark green", 3.0));
        System.out.println("my cars" + out);


        // Одно и тоже
        changeCar(out.get(0), car -> {
            car.color = "black";
            car.engine = 2.2;
            System.out.println("car my girl" + car);
        });
        // Одно и тоже
        Consumer<Car> consumer = car -> {
            car.color = "black";
            car.engine = 2.2;
            System.out.println("car my girl" + car);
        };

        System.out.println("my cars" + out);

    }
}