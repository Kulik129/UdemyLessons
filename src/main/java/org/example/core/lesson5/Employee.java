package org.example.core.lesson5;

public class Employee {
    protected int id;
    public String surname;
    int age;
    private int salary;
    String department;

    Employee(int id2, String surname2, int age2, int salary2, String department2) {
        id = id2;
        surname = surname2;
        age = age2;
        salary = salary2;
        department = department2;
    }

    public Employee(int i, String s){
        id = i;
        surname = s;
    }

    private Employee(int a){
        age = a;
    }
    Employee(String s){
        surname = s;
    }

    int salaryIncrease(int sum) {
        salary *= sum;
        return salary;
    }
    Employee(){}

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
