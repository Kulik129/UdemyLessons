package org.example.lambda.lesson1.example1;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentInfo {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Mariya", 'f', 18, 4, 4.1));
        students.add(new Student("Nikolay", 'm', 23, 4, 8.4));
        students.add(new Student("Viktor", 'm', 20, 2, 7.4));
        students.add(new Student("Ivan", 'm', 24, 1, 3.4));
        students.add(new Student("Dmitrii", 'm', 19, 4, 4.4));

        StudentInfo info = new StudentInfo();
        /*
        // Сортировка студентов по курсу
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.course-o2.course; // Определяем сортировку по курсу
            }
        });
        */
        // Сортировка студентов по курсу с лямбдой
        /*
        Collections.sort(students, (st1, st2) -> st1.course-st2.course);  // Определяем сортировку по курсу

        System.out.println(students);
        */

//        info.testStudents(students, new StudentCheck() {
//            @Override
//            public boolean check(Student student) {
//                return student.sex == 'f';
//            }
//        });
        System.out.println("---------------------------------------------------");
        // Лямбда выражение с таким же функционалом как выше
        info.testStudents(students, p -> p.sex == 'f');

        // Использование анонимного класса
//        info.testStudents(students, new StudentCheck() {
//            @Override
//            public boolean check(Student student) {
//                return student.age < 20;
//            }
//        });
        System.out.println("---------------------------------------------------");
       // Лямбда выражение с таким же функционалом как выше
        info.testStudents(students,param -> param.age < 20);
        System.out.println("---------------------------------------------------");
        info.testStudents(students, student -> student.avGrade < 4);
        System.out.println("---------------------------------------------------");


        // Используя Predicate отфильтруем студентов
        Predicate<Student> p1 = student -> student.avGrade > 5;
        Predicate<Student> p2 = student -> student.sex == 'm';
        info.testStudents(students, p1.and(p2)); // and объединяет две проверки
        info.testStudents(students, p1.or(p2)); // Или
        info.testStudents(students, p1.negate()); // Отрицание 1 -й проверки (p1)

        // Используя Function который принимает и отдает параметры реализовали
        // функцию средней арифметической оценки всех студентов
        double res = avg(students, student -> student.avGrade);
        System.out.println(res);
    }

    private static double avg(List<Student> students, Function<Student, Double> studentDoubleFunction) {
        double res = 0;
        for (Student student: students) {
            res +=studentDoubleFunction.apply(student);
        }
        res = res / students.size();
        return res;
    }

    // Для использования созданного нами интерфейса StudentCheck
//    public void testStudents(ArrayList<Student> students, StudentCheck studentCheck) {
//        for (Student student : students) {
//            if (studentCheck.check(student)) {
//                System.out.println(student);
//            }
//        }
//    }

    // Для использования Predicate
    public void testStudents(ArrayList<Student> students, Predicate<Student> pr) {
        for (Student st : students) {
            if (pr.test(st)) {
                System.out.println(st);
            }
        }
    }
}
