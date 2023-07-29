package org.example.lesson18.hw;

public class HomeWork2 {
    public static void main(String[] args) {
        String[][] array = {{"near", "build", "world"}, {"where", "live"}, {"good"}};
        show(array);
    }
    static void show(String[][] array){
        System.out.println();
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{ ");
            for (int j = 0; j < array[i].length; j++) {
                if (j != array[i].length - 1) {
                    System.out.print(array[i][j] + ", ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
                // array[i].length = 3
//                if (array[j].length > 0) {
//                    System.out.print(array[i][j] + ", ");
//                }
            }
            if (i != array.length - 1) {
                System.out.print("}, ");
            } else {
                System.out.print("}");
            }
//            System.out.print("}");
        }
        System.out.print(" }");
        System.out.println();
    }
}
