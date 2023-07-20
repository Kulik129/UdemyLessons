package org.example.lesson5;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee(1,"Kulik",27,200000,"IT");
        employee.setSalary(6);
        System.out.println(employee.salaryIncrease(6));

        Employee employee2 = new Employee(2,"Kovaleva",24,200000,"Konsalting");
        employee2.setSalary(2);
        System.out.println(employee2.salaryIncrease(3));


        // non static
        EmployeeTest et = new EmployeeTest();
        et.showSalary(employee2);
        et.showSalary(employee);

        // static
        showSalaryST(employee);

        show(employee2);

        Employee e = new Employee(2,"Tom");

        Employee emm = new Employee("Holand");
    }

    public static void showSalaryST(Employee e){
        System.out.println(e.getSalary());
    }

    public  void showSalary(Employee e){
        System.out.println(e.getSalary());
    }

    public static void show(Employee employee){
        System.out.println(employee);
    }
}
