package org.example.lesson24;

public class Test5 {
}
interface I1{
    void abc();
    default void df(){
        System.out.println("Method df");
    }
}

class Zero implements  I1 {
    @Override
    public void abc() {
        System.out.println("Method abc");
    }

    @Override
    public void df() {
        System.out.println("@Override df");
    }

    public static void main(String[] args) {
        Zero z = new Zero();
        z.abc();
        z.df();
    }
}
