package org.example.lesson16;

public class Test {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1.isBlank()); // false если есть символы типа Р Н и т.д.

        String s2 = " ";
        System.out.println(s2.isBlank()); // true если есть Табы или Пробелы

        String s3 = "";
        System.out.println(s3.isEmpty()); // true если строка пуста

        String s4 = "    Hello      ";
        System.out.println(s4.strip()); // Удаляет пробелы по бокам как и trim()

        System.out.println(s4.stripLeading()); // Удаляет пробелы в начале строки

        System.out.println(s4.stripTrailing()); // Удаляет пробелы в конце строки
    }
}
