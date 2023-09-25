package org.example.generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(103);
        list.add(120);
        int a = GenMethod.getElement(list);
        System.out.println(a);


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Hello");
        list1.add("LOL");
        list1.add("KEK");

        String s = GenMethod.getElement(list1);
        System.out.println(s);
    }
}
class GenMethod {
    /**
     * Parameterized метод
     * @param arrayList
     * @return
     * @param <T> тип данных который будет нам возвращать метод
     */
    public static <T> T getElement(ArrayList<T> arrayList) {
        return arrayList.get(1);
    }
}
