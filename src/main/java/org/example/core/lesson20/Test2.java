package org.example.core.lesson20;

public class Test2 {
    public static void main(String[] args) {
        sum(2,3,3);
    }
    static void sum(int...a){
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa +=a [i];
        }
        System.out.println(summa);
    }
}
