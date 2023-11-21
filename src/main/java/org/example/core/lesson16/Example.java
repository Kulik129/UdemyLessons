package org.example.core.lesson16;

public class Example {
    public static void main(String[] args) {
        String m = "fg@gmail.com; fgh@mail.ru;";
        email(m);
    }

    static void email(String email) {
        int a = 0;
        int b = 0;
        int c = 0;
        /*
        while (c < email.length() - 1){
            a = email.indexOf("@", c);
            b = email.indexOf(".", c);
            c = email.indexOf(";", c + 1);
            String out = email.substring(a + 1, b);
            System.out.println(out);
        }
        */

        for (int i = 0; i < 2; i++) {
            a = email.indexOf("@", c);
            b = email.indexOf(".", c);
            c = email.indexOf(";", c + 1);
            String out = email.substring(a + 1, b);
            System.out.println(out);

        }
    }
}
