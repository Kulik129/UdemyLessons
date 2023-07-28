package org.example.lesson17;

public class Example {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("123");
        StringBuilder sb2 = new StringBuilder("1236");
        StringBuilder sb3 = sb1;
        System.out.println(sb1.equals(sb3));
    }
}
