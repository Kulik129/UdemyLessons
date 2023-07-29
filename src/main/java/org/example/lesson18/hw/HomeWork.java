package org.example.lesson18.hw;

import java.util.Arrays;

public class HomeWork {
    public static void main(String[] args) {
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        int[] arr = sorted(array);
        System.out.println(Arrays.toString(arr));
    }
    static int[] sorted(int[] array) {
        int min;
        int countOuterLoop = 0;
        int countInnerLoop = 0;

        for (int i = 0; i < array.length; i++) {
            countOuterLoop++;
            int max = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < max) {
                    min = array[j];
                    array[j] = max;
                    array[i] = min;
                    max = min;
                }
                countInnerLoop++;
            }
        }
        System.out.println("Внешний цикл: " + countOuterLoop + " Внутренний цикл: " + countInnerLoop);
        return array;
    }
}
