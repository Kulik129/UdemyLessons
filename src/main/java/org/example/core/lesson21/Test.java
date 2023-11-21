package org.example.core.lesson21;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hi");
        list.add("by");
        list.add("by");
        list.add("by");
        list.add("by");
        list.add(0,"hi");
        list.set(0,"new");
        for (String s:list){
            System.out.println(s);
        }
    }
}


