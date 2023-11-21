package org.example.core.lesson20;

public class Test8 {
    public static void main(String[] args) {
        int[]array = new int[4];
        for (int i = 0; i < array.length; i++) {
            array[i]= i+2;
        }
        for (int a:array){
            System.out.print(a+" ");
        }
    }

}
