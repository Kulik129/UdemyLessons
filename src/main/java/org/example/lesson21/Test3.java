package org.example.lesson21;

import java.util.Arrays;


public class Test3 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,5};
        int[] array3 = {8,2,3,5};

        char[] array4 = {'p','i','v','e','t'};
        char[] array5 = {'p','i','v','e','t','o'};
        char[] array6 = {'p','i','v','i','v','k','a'};

        System.out.println(Arrays.mismatch(array1,array2)); // 3
        System.out.println(Arrays.mismatch(array4,array5)); // 5

    }
}
