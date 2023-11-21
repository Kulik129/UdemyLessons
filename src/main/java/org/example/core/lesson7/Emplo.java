package org.example.core.lesson7;

public class Emplo {
    private int id;
    public int age;
    protected String name;

    Emplo() {
    }

    private Emplo(int i) {
        id = i;
    }

    public Emplo(int i, int a, String n) {
        id = i;
        age = a;
        name = n;
    }
    Emplo(String n){
        name = n;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
