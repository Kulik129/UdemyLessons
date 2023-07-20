package org.example.lesson7;

public class EmTest {
    public static void main(String[] args) {
        Emplo e = new Emplo();
        e.setId(6);
        System.out.println(e.getId());

        Emplo ee = new Emplo(9,44,"pp");
        System.out.println(ee.getId());
    }
}
