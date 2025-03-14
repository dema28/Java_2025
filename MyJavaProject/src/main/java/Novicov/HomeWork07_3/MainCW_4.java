package Novicov.HomeWork07_3;
/*
Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
 */
public class MainCW_4 {
    public static int findSmallestInt(int[] arr) {
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) smallest = arr[i];
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] arr1 = {34, 15, 88, 2};
        int[] arr2 = {34, -345, -1, 100};

        System.out.println(findSmallestInt(arr1)); // Output: 2
        System.out.println(findSmallestInt(arr2)); // Output: -345
    }
}


/*
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
     int smallest = args[0];
      for (int i = 1; i < args.length; i++)
            if (args[i] < smallest) {
                smallest = args[i];
        }
        return smallest;
    }
}
 */