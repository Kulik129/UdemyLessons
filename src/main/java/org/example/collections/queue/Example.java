package org.example.collections.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        // Добавление
        queue.add("Ivan");
        queue.add("Nikolay");
        queue.add("Vasiliy");
        queue.add("Vladimir");
        queue.add("Dmitrii");
        System.out.println(queue);
        // Добавление когда очередь ограничена
        queue.offer("Ivan");
        queue.offer("Nikolay");
        queue.offer("Vasiliy");
        queue.offer("Vladimir");
        queue.offer("Dmitrii");

        // Удаление
        System.out.println(queue.remove()); //  удаляется первый элемент
        System.out.println(queue);

        // Первый элемент в очереди
        System.out.println(queue.element());
    }
}
