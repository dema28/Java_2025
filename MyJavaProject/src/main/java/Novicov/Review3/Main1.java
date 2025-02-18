package Novicov.Review3;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int[] array1 = new int []{1, 2, 3, 4};
        int[] array2 = new int[array1.length];


        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
            array2[i] = array1[i];
        }

        array2 = array1.clone();
        array1[1] = -2;
        array2[0] = 100;

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));



    }
}
