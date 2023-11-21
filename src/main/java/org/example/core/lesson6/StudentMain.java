package org.example.core.lesson6;

public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student(1);
        System.out.println(st.id);

        Student st1 = new Student(1, 2, "Mikhail", "Solovyanov");
        System.out.println(st1.course);

        Student st2 = new Student(1, 4);
        System.out.println(st2.course);

        Student st3 = new Student(1, 4);
        st3.name = "Dmitrii";
        System.out.println(st3.name);
    }
}
