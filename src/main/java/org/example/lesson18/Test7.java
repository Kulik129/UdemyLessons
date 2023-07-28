package org.example.lesson18;

public class Test7 {
    public static void main(String[] args) {
        char[] array = {'p', 'r', 'i', 'v', 'e', 't'};
        StringBuilder stringBuilder = new StringBuilder("Hello world");
        stringBuilder.append(array, 2, 3);
        System.out.println(stringBuilder); // Hello worldive

        StringBuilder stringBuilder2 = new StringBuilder("Hello world");
        stringBuilder2.insert(2,array,1,3);
        System.out.println(stringBuilder2); // Herivllo world
    }
}
