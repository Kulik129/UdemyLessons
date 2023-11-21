package org.example.collections.set;

import java.util.HashSet;
import java.util.Set;

public class SetExampl {
    public static void main(String[] args) {
        Set<Integer> integerSet = new HashSet<>();
        integerSet.add(23);
        integerSet.add(20);
        integerSet.add(22);
        integerSet.add(25);
        integerSet.add(21);
        for (Integer j : integerSet) {
            System.out.println(j);
        }

    }
}
