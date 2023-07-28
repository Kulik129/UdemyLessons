package org.example.lesson17.hw;

public class Test {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("123");
        StringBuilder stringBuilder1 = new StringBuilder("123");
        System.out.println(equality(stringBuilder, stringBuilder1));
    }

    static boolean equality(StringBuilder stringBuilder1, StringBuilder stringBuilder2) {
        boolean answer = true;

        for (int i = 0; i < stringBuilder1.length(); i++) {
            if (stringBuilder1.charAt(i) == stringBuilder2.charAt(i)) {
                answer = true;
            } else {
                answer = false;
            }
        }

        return answer;
    }
}
