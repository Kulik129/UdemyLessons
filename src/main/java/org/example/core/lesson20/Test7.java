package org.example.core.lesson20;

import java.util.Arrays;

public class Test7 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("fdsf");
        StringBuilder sb2 = new StringBuilder("sds");
        StringBuilder sb3 = new StringBuilder("ew");
        StringBuilder[] array = {sb, sb2, sb3};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = 3;
//        }
        for (StringBuilder s : array) {
            s.append(" hi");
        }
        System.out.println(Arrays.toString(array));
    }
}
