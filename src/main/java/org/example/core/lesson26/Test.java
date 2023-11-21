package org.example.core.lesson26;

public class Test {
    int i = 0;

    {
         i++;
    }
    public static void main(String[] args) {
        Test test = new Test();
        Test test2 = new Test();
        Test test3 = new Test();
        Test tes4 = new Test();
        System.out.println(test.i);
        System.out.println(test.i);
        System.out.println(test.i);
    }
}
