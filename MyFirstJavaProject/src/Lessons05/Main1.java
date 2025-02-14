package Lessons05;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {

        int a = 1;


        int[] array ={1, 2, 3, 4, 50, -1};

        System.out.println(array.length);


        // в основном используют так
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }

        for (int i = 0; i < 6; i++) {
            array[i] = array[i] + 1;

        }
        System.out.println(Arrays.toString(array));

    }
}
