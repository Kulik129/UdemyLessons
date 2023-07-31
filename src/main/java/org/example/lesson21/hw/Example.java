package org.example.lesson21.hw;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
        Example ex = new Example();
        ex.method("c","a","b");
    }
    void  method(String ...strings){
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings){
            list.add(s);
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
