package org.example.lesson22;

public class Human2 {

    public String name;
    public static int salary = 150;
    public void work(){
        System.out.println("Woooooooork");
    }
    public void rest(){
        System.out.println("Reeest");
    }
}
class Student extends Human2{
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "dss";
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        s.rest();
    }
}
