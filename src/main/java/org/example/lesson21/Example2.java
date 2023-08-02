package org.example.lesson21;

import java.util.ArrayList;
import java.util.Collections;

public class Example2 {
    public static void main(String[] args) {
        int[] aa = {6,5,4,3,2,1};
        int[]dd = aaa(aa);
        for (int h:dd){
            System.out.println(h);
        }
    }
    static int[] aaa(int[] array){
        ArrayList<Integer> list = new ArrayList<>();
        for (Integer i: array){
            list.add(i);
        }
        Collections.sort(list);
        for (int i = 0; i < array.length; i++) {
            array[i]=list.get(i);
        }
        return array;
    }
}
