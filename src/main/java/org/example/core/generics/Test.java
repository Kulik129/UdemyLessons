package org.example.core.generics;

public class Test {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Hello");
        System.out.println(info.getValue()); // Hello
        System.out.println(info); // Info {value = Hello}       (@Override toString)

        Info<Integer> info1 = new Info<>(100);
        System.out.println(info1);
    }
}

/**
 * Parameterized class
 * @param <T> подставляемый тип данных который потом будет использован при создании объекта
 */
class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Info {" +
                "value = " + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
