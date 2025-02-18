package Novicov.Review3;

import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, -4, 5};

//        int min = array[0];
//        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : array) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println(Arrays.toString(array));
        System.out.println(max);


    }
}
