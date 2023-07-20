package org.example.lesson11;

public class ExampleTest {
    public static void main(String[] args) {
         Example emp = new Example("Ivan",100.55);
         double d = emp.increase(emp.salary);
        System.out.println(d);
        System.out.println(emp.salary);
        emp.increase();
        System.out.println(emp.salary);
    }
}
