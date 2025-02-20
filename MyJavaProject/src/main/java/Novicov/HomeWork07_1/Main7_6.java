package Novicov.HomeWork07_1;
/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести максимальное значение массива.
 */
public class Main7_6 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int max = array[0][0];

        for (int[] row : array) {
            for (int num : row) {
                if (num > max) {
                    max = num;
                }
            }
        }
        System.out.println("Максимальное значение массива: " + max);
    }
}
