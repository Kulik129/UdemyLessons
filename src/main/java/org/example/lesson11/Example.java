package org.example.lesson11;

public class Example {
    public String name;
    public double salary;

    Example(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double increase(double a) {
        a = a * 2;
        return a;
    }

    public double increase() {
        salary = salary * 2;
        return salary;
    }
}
