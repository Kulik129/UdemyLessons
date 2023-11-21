package org.example.core.lesson22;

public class Human {
    final String pol;
private boolean smart;
    Human(String pol) {
        this.pol = pol;
    }

    private String name;
    private int age;
    private int weight;

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }
}

class Test {
    public static void main(String[] args) {
        Human human = new Human("men");
        human.setName("Petr");
        human.setAge(25);
        human.setWeight(65);
        System.out.println(human.getName());
        System.out.println(human.getAge());
        System.out.println(human.getWeight());
    }
}
