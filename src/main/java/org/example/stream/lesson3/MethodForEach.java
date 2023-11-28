package org.example.stream.lesson3;

import java.util.Arrays;

public class MethodForEach {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 22, 3, 4,};
        Arrays.stream(arr).forEach(el -> Utils.method(el));
    }
    public static class Utils {
        public static void method(int a) {
            a += 5;
            System.out.println("Element: " + a);
        }
    }
}

