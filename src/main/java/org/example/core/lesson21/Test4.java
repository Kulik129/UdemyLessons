package org.example.core.lesson21;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("one");
        list.add("two");
        list.add("there");
        list.add("fore");
        list.add("fife");

        for (Object obj:list){
            System.out.println("Number "+obj+" length " +((String)obj).length());
        }
    }
}
