package org.example.lesson21;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        arrayList.add("11");
        arrayList.add("25");
        arrayList.add("31");
        arrayList.add("45");
        arrayList.add("54");
        arrayList.add("62");

        Object [] objects = arrayList.toArray();
        for (Object s:objects){
            System.out.print(s+" ");
        }
        System.out.println();

        String[]array= arrayList.toArray(new String[15]);
        for (String ss:array){
            System.out.print(ss+" ");
        }
    }
}
