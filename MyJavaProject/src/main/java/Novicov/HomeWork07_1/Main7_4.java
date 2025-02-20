package Novicov.HomeWork07_1;
/*
Дан массив:
int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
необходимо вывести среднее арифметическое всех значений массива.
 */
public class Main7_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double average = calculateAverage(array);
        System.out.println("Среднее арифметическое всех значений массива: " + average);
    }

    private static double calculateAverage(int[] array) {
        int sum = 0;
        for (int number : array) {
            sum += number;
        }
        return (double) sum / array.length;
    }
}
