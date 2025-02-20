package Novicov.HomeWork07_1;
/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести количество элементов в массиве.
 */
public class Main7_7 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int count = 0;
        for (int[] subArray : array) {
            for (int element : subArray) {
                count++;
            }
        }
        System.out.println("Количество элементов в массиве: " + count);
    }
}
