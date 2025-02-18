package Novicov.Review3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {1, 2, 3, 4};

        for (int i = 0; i < 4; i++) {
            array2[i] = array1[i];

        }

        System.out.println(array2.length);
        System.out.println(array2.length - 1);
        System.out.println(array1.length - 1);

        int i = 0;
        for (int numbers : array1) {
            array2[i] = array1[i];
            i++;
        }

        for (int j = 0; j < array1.length; j++) {
            array2[j] = array1[j];
        }

        System.out.print("[");
        for (int number : array1) {
            System.out.print(number);
            System.out.print(", ");
        }
        System.out.println("]");

//        array2 = array1;

        array2[1] = -2;
        array2[0] = 100;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}
