package org.example.lesson25;

public class Test {
    public static void main(String[] args) {
        Employ employ1 = new Teacher();
        Employ employ2 = new Driver();
        Employ employ3 = new Doctor();
//        employ1.work();
//        employ2.work();
//        employ3.work();
        Employ[] array = {employ1,employ2,employ3};
        for (Employ employ: array){
            employ.work();
        }
    }
}

abstract class Employ {
    void sleep() {
        System.out.println("Employ slips");
    }

    abstract void work();
}

class Teacher extends Employ implements Help_able {
    @Override
    void work() {
        System.out.println("Teacher work");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employ implements Help_able {
    @Override
    void work() {
        System.out.println("Driver work");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employ implements Help_able {
    @Override
    void work() {
        System.out.println("Doctor work");
    }

    @Override
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}