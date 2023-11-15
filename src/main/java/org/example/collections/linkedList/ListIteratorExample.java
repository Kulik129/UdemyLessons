package org.example.collections.linkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        ListIterator<Character> iterator = list.listIterator(); // Итерирует с 0
        ListIterator<Character> reverseIterator = list.listIterator(list.size()); // Итерирует с конца

        boolean isPalindrome = true;

        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next() != reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
