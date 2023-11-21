package org.example.core.lesson21;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hi");
        StringBuilder stringBuilder3 = new StringBuilder("Key");
        list.add(stringBuilder1);
        list.add(stringBuilder2);
        list.add(stringBuilder3);

        for (int i = 0; i <list.size();i++){
            list.get(i).append(" !!!!");
        }
        for(StringBuilder s: list){
            System.out.println(s);
        }
        System.out.println();
        list.remove(2); // удаление по индексу
        list.remove(stringBuilder1); // удаление по объекту
        list.remove(new StringBuilder("Hello")); // так не пишем, удаления не произойдет
        for (StringBuilder ss: list){
            System.out.println(ss);
        }
    }
}
