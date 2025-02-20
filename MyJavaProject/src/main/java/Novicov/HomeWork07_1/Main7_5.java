package Novicov.HomeWork07_1;
/*
Дан массив:
int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
необходимо вывести сумму элементов массива.
 */
public class Main7_5 {
    public static void main(String[] args) {
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum = 0;
        for (int[] row : array) {
            for (int num : row) {
                sum += num;
            }
        }
        System.out.println("Сумма всех эл. массива: " + sum);
    }
}
