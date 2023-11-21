package org.example.lambda.lesson4;

import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Снова что-то нужно придумать", "я не понимаю от куда столько", "если быыыыыы");
        list.forEach(str -> System.out.println(str));
        System.out.println();
        List<Integer> list2 = List.of(1, 2, 3, 4, 5, 6, 7);
        list2.forEach(integer -> {
            integer *= 2;
            System.out.println(integer);
        });
    }

}
