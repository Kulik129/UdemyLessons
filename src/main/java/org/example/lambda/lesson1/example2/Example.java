package org.example.lambda.lesson1.example2;

public class Example {
    public static void def(InterfExample i){
        System.out.println(i.test("Hi"));
    }

    public static void main(String[] args) {
        def(len -> len.length());
    }
}
