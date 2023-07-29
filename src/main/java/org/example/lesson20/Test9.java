package org.example.lesson20;

public class Test9 {
    public static void main(String[] args) {
        int[] arr1 = {4, 5, 2, 4, 5};
        int[] arr2 = {6, 1, 3, 8, 3};
        for (int i = 0; i < arr1.length && i < arr2.length; i++) {
            arr1[i] = 3;
            arr2[i] = 12;
        }
    }
}
