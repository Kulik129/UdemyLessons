package org.example.core.lesson18;

import java.util.Arrays;

public class Test4 {
    public static void main(String[] args) {
        int arr1[] = {1, 9, 3, -8, 0, 5, 4, 1};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        Arrays.sort(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int ind = Arrays.binarySearch(arr1, 10);
        System.out.println(ind);

        System.out.println();
    }
}
