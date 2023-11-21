package org.example.core.lesson20;

public class Test5 {
    public static void main(String[] args) {
        String[] array = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"Mat", "Philosophy"};
        for (String s1 : array) {
            for (String s2 : exams) {
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
