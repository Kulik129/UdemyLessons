package org.example.lesson24;

public class Test3 {
}
class Employ{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat() {
        System.out.println("я поел");
    }
    void sleep() {
        System.out.println("Спать");
    }
}
class Teacher extends Employ implements HelpAble{
    int kolUcenikov;
    void uchit() {
        System.out.println("Учу");
    }
    public void help(){
        System.out.println("Учитель помогает");
    }
    public void tushit(){
        System.out.println("Учитель тушит");
    }
}
class Driver extends Employ implements SwimAble,HelpAble{
    String nazvanieMashiny;
    void vodit(){
        System.out.println("Vodit ");
    }

    public void help(){
        System.out.println("Водитель помогает");
    }
    public void tushit(){
        System.out.println("Водитель тушит");
    }
    public void swim (){
        System.out.println("Водитель плавает");
    }
}

interface HelpAble{
    void help();
    void tushit();
}
interface SwimAble{
    void swim ();
}