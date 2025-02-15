package Novicov.HomeWork06;


/*
Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так,
чтобы количество строк и количество столбцов совпадало).
Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот.
Внимание! Не надо менять структуру массива. Задание требует только переместить элементы массива.
Тип элементов массива может быть любой по вашему выбору.
 */
public class Main4 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        // Преобразование массива
        int[][] transposedMatrix = transposeMatrix(matrix);

        // Вывод транспонированного массива
        for (int[] row : transposedMatrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }
}
