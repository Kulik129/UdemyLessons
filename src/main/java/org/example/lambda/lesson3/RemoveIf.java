package org.example.lambda.lesson3;

import java.util.ArrayList;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> l=new ArrayList<>();
        l.add("Какая-то дичь");
        l.add("Тут");
        l.add("а еще сюда нужно что-то");
        l.add("что сложно придумывать");
        l.add("ну я вроде справился");
        l.add("а так хз");


        l.removeIf(elment -> elment.length() < 9);

        System.out.println(l);
    }
}
