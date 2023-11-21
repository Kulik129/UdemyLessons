package org.example.core.lesson14;

public class Example {
    public static void main(String[] args) {
        printTime();
    }

    public static void method() {
        OUTER:
        for (int hour = 0; hour < 6; hour++) {
            MIDDLE:
            for (int min = 0; min < 60; min++) {
                if (hour > 1 && min % 10 == 0) {
                    break OUTER;
                }
                INNER:
                for (int sec = 0; sec < 60; sec++) {
                    if (sec * hour > min) {
                        continue MIDDLE;
                    }
                    System.out.println(hour + ":" + min + ":" + sec);
                }
            }
        }
    }
    public static void printTime() {
        for (int hour = 0; hour <= 6; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    if (hour > 1 && minute % 10 == 0) {
                        return; // прекратить выполнение метода, если час > 1 и минута кратна 10
                    }
                    if (second * hour > minute) {
                        break; // выйти из внутреннего цикла, если секунда * час > минута
                    }
                    System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
                }
            }
        }
    }

}
