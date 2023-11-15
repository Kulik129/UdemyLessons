package org.example.collections.binarySeartch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Example {
    public static void main(String[] args) {
       method1();
    }

    public static int ind() {
        int[] arr = {-3, 8, 12, -8, 105, 5, 10, 1, 15, 30, 19};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int ind = Arrays.binarySearch(arr,105);
        System.out.println(ind);
        return ind;
    }
    public List<Employ> employs() {
        List<Employ> employs = new ArrayList<>();

        employs.add(new Employ(102, "Zaur", 12333));
        employs.add(new Employ(101, "Ivan", 4533));
        employs.add(new Employ(105, "Petr", 1233));
        employs.add(new Employ(10, "Mariya", 1234533));
        employs.add(new Employ(109, "Kolya", 1233));
        employs.add(new Employ(107, "Sasha", 1243));
        employs.add(new Employ(106, "Elena", 123465));

        System.out.println(employs); // Не сортированный список

        Collections.sort(employs); // Переопределяем compareTo (64 строка).

        System.out.println(employs); // Сортированный список

        int index = Collections.binarySearch(employs, new Employ(106, "Elena", 123465)); // Ищем индекс работника в отсортированном списке

        System.out.println(index);
        return employs;
    }

    public static ArrayList<Integer> method1() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(-3);
        list.add(8);
        list.add(12);
        list.add(-8);
        list.add(0);
        list.add(5);
        list.add(10);
        list.add(1);
        list.add(150);
        list.add(30);
        list.add(19);

        Collections.sort(list); // Сортировка по возрастанию
        System.out.println(list);

        int ind = Collections.binarySearch(list, 12);
        System.out.println(ind);

        Collections.reverse(list); // Сортировка по убыванию
        System.out.println(list);

        Collections.shuffle(list); // Перемешать лист
        System.out.println(list);
        return list;
    }

    public static class Employ implements Comparable<Employ> {
        int id;
        String name;
        int salary;

        public Employ(int id, String name, int salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employ{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }

        @Override
        // Переопределяем сортировку по id если id одинаковый проверяется имя
        public int compareTo(Employ o) {
            int res = this.id - o.id;
            if (res == 0) {
                res = this.name.compareTo(o.name);
            }
            return res;
        }
    }
}
