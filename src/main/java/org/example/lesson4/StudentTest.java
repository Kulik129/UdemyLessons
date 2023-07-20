package org.example.lesson4;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.studentIDNumber = 1234;
        student1.name = "Tom";
        student1.lastName = "Shelbi";
        student1.yearOfGraduation = 2012;
        student1.mathematics = 3.3;
        student1.economy = 4.4;
        student1.foreignLanguage = 4.1;

        Student student2 = new Student();
        student2.studentIDNumber = 543;
        student2.name = "Harry";
        student2.lastName = "Potter";
        student2.yearOfGraduation = 2011;
        student2.mathematics = 5.0;
        student2.economy = 4.5;
        student2.foreignLanguage = 4.4;
        StudentTest d = new StudentTest();

        System.out.println(input(student1));
    }

    /**
     * Средняя арифметическая оценка
     * @param student принимает объект студента
     * @return
     */
    public static double result(Student student){
        double res = (student.mathematics + student.economy + student.foreignLanguage) / 3;
        return res;
    }

    /**
     * Печать результата
     * @param student принимает объект студента
     * @return
     */
    static String input(Student student){
        String input = "Номер студенческого: " + student.studentIDNumber + " Имя: "+student.name+" Фамилия: "+student.name+" Год: "+student.lastName+" средняя оценка: "+result(student);
        return input;
    }
}
