package org.example.lambda.lesson4;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Example {
    public static void main(String[] args) {
        // Вызвал метод и описал что нужно сделать
        ArrayList<Car> cars = createCar(() -> new Car("BMW X6", "Black", 5.0));
        System.out.println(cars);

        // Вызвал метод и описал что нужно сделать
        change(cars.get(0), car -> {
            car.color = "White";
        });
        System.out.println(cars);

    }

    /**
     * Создание нового авто при помощи Supplier
     *
     * @param carSupplier
     * @return
     */
    public static ArrayList<Car> createCar(Supplier<Car> carSupplier) {
        ArrayList<Car> cars = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            cars.add(carSupplier.get());
        }
        return cars;
    }
    public static void change(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    private static class Car {
        String model;
        String color;
        double engine;

        public Car(String model, String color, double engine) {
            this.model = model;
            this.color = color;
            this.engine = engine;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "model='" + model + '\'' +
                    ", color='" + color + '\'' +
                    ", engine=" + engine +
                    '}';
        }
    }
}
