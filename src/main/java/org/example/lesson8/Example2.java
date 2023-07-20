package org.example.lesson8;

public class Example2 {
    static final double PI = 3.14;

    public double areaOfTheCircle(double area) {
        double ans = PI * area * area;
        return ans;
    }

    public static double circumferenceLength(double radius) {
        double length = 2 * PI * radius;
        return length;
    }

    public void show(double radius) {
        System.out.println("Радиус "+radius);
        System.out.println("Площадь круга "+circumferenceLength(radius));
        System.out.println("Длина окружности  "+areaOfTheCircle(radius));
    }
}
