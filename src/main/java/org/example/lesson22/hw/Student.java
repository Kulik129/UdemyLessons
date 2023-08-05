package org.example.lesson22.hw;

public class Student {
    StringBuilder name = new StringBuilder();
    int cource;
    int grade;

    public StringBuilder getName() {
        return name;
    }

    public void setName(StringBuilder name) {
        if (name.length() > 3) {
            this.name = name;
        }
    }

    public int getCource() {
        return cource;
    }

    public void setCource(int cource) {
        if (cource >=1 && cource<=4){
            this.cource = cource;
        }
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >1 && grade<11){
            this.grade = grade;
        }
    }

    public void showInfo(){
        System.out.println(getGrade());
        System.out.println(getCource());
        System.out.println(getName());
    }
}
