package Novicov.Review3;

import java.util.Arrays;

public class Main4 {
    public static void main(String[] args) {

        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7,};

        int search = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("Element found at index: " + i);
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
