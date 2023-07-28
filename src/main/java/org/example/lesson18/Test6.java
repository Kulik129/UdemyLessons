package org.example.lesson18;

public class Test6 {
    public static void main(String[] args) {
        double[] arr = {1.4, 5.3, 6.4, 3.4};
//        maxMin(arr);
        maxMin(new double[]{3.5, 6.3, 5.2, 2.9, 4.5});
    }

    public static void maxMin(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min + " Max = " + max);
    }
}
