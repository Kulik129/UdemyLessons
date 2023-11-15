package org.example.collections.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MethodsArrayList {
    public static void main(String[] args) {
        methods5();
    }

    private static List<Integer> methods5() {
        List<Integer> integers = List.of(3,8,13); // Созданный лист таким образом не изменить, выйдет ошибка. Не могут содержать null
        System.out.println(integers);

        List<Integer> list = List.copyOf(integers); // Копируем лист. Его так не модифицировать. Не могут содержать null
        System.out.println(list);

        return integers;
    }

    public static ArrayList<String> methods4() {
        ArrayList<String> strings1 = new ArrayList<>();

        strings1.add("Ivan");
        strings1.add("Vicktor");
        strings1.add("Katy");
        strings1.add("Dima");
        strings1.add("Olya");
        strings1.add("Ira");

        ArrayList<String> strings2 = new ArrayList<>();

        strings2.add("Ivan");
        strings2.add("Vicktor");
        strings2.add("Katy");

        strings1.removeAll(strings2); // Удаляет все из 1 листа, что дублируется во втором.
        strings1.retainAll(strings2); // Оставит только то что есть в обоих листах.

        boolean res = strings1.containsAll(strings2); // Проверяет содержаться ли элементы в массиве strings1 такие же, как и в strings2. True если да.

        List<String> stringList = strings1.subList(1, 3); // Создает из листа отрывок с начального и по конечный индекс и возвращает лист

        return null;
    }

    public static List<StringBuilder> methods3() {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder[] arr = {sb1, sb2, sb3, sb4};

        List<StringBuilder> list = Arrays.asList(arr); // Добавляем массив в List, его длина будет == длине arr.
        return list;
    }

    public static ArrayList<String> methods2(ArrayList<String> list1) {
        ArrayList<String> list2 = new ArrayList<>();

        list2.add("Code");
        list2.add("Css");
        list2.addAll(list1); // Добавить все элементы из первого листа во второй. (Элементы из первого листа встанут в конец).
        list2.addAll(1, list1); // Добавить все элементы из первого листа во второй с 1 элемента.
        list2.clear(); // Очищает массив.

        return list2;
    }

    public static ArrayList<String> methods1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Data"); // Добавить данные
        list.add("Type"); // Добавить данные
        list.add("IDEA"); // Добавить данные
        list.add("VS"); // Добавить данные
        list.add(0, "Misha"); // Добавить данные на определенную позицию
        list.get(1); // Получить элемент по индексу
        list.set(1, "Dima"); // Заменить 1 элемент (Data) на Dima
        list.remove(1); // Удалить элемент по индексу
        list.remove("Misha"); // Удалить явный элемент, вернется true если элемент найден и удален.

        return list;
    }

    public static ArrayList<Student> student() {
        Student student1 = new Student("IVAN", 'm', 23, 3, 3.5);
        Student student2 = new Student("ELENA", 'f', 22, 3, 4.5);
        Student student3 = new Student("NIKOLAI", 'm', 21, 3, 4.7);
        Student student4 = new Student("IRINA", 'f', 24, 3, 4.4);
        Student student5 = new Student("PETR", 'm', 22, 3, 5.0);
        Student student6 = new Student("MARIYA", 'f', 23, 3, 4.7);

        ArrayList<Student> students = new ArrayList<>();

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        System.out.println(students);

        Student student7 = new Student("MARIYA", 'f', 23, 3, 4.7);
        students.remove(student7); // Если метод equals в классе Student не переопределен, мы не сможем удалить из students объект student7, который с такими же параметрами как и student6

        System.out.println(students);

        int index1 = students.indexOf(student4); // Выводит индекс на котором стоит элемент. (Первое совпадение)
        int index2 = students.lastIndexOf(student4); // Выводит индекс на котором стоит элемент. (Первое совпадение)
        int size = students.size(); // Размер массива
        boolean empty = students.isEmpty(); // Проверяет пустой массив или нет. false если массив не пустой
        boolean content = students.contains(student4); //  true если есть такой объект в массиве.

        System.out.println(content);

        return students;
    }
}

class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return sex == student.sex && age == student.age && course == student.course && Double.compare(student.avgGrade, avgGrade) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, course, avgGrade);
    }
}
