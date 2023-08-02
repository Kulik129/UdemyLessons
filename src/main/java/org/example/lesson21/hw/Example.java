package org.example.lesson21.hw;

import java.util.ArrayList;
import java.util.Collections;

public class Example {
    public static void main(String[] args) {
//        Example ex = new Example();
//        ex.method("c","a","b");
        Example example21 = new Example();
        System.out.println(example21.abc("c","a","b"));
    }
    void  method(String ...strings){
        ArrayList<String> list = new ArrayList<>();
        for (String s : strings){
            list.add(s);
        }
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    public ArrayList<String> abc(String ... data){
        ArrayList<String> list = new ArrayList<>();
        for (String s: data){
            list.add(s);
        }
        Collections.sort(list);
        return list;
    }
}
