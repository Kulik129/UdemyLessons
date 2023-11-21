package org.example.collections.stack;

import java.util.Stack;

public class Example {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Добавление элементов
        stack.push("Lada");
        stack.push("BMB");
        stack.push("Mers");
        stack.push("Urus");
        stack.push("Nisan");
        stack.push("Opel");


        System.out.println(stack);
        System.out.println(stack.pop()); // Получить элемент последний элемент. (Сразу после получения он удаляется.
        System.out.println(stack);

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }
        System.out.println(stack);



        System.out.println(stack);
        System.out.println(stack.peek()); // Возвращает элемент на самом верху стека и не удаляет его
        System.out.println(stack);

    }
}
