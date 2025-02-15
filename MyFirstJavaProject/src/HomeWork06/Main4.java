package HomeWork06;

import static com.sun.org.apache.bcel.internal.classfile.Utility.printArray;

/*
Создайте массив размером 5 на 5 (или 10 на 10, или любого другого размера так,
чтобы количество строк и количество столбцов совпадало).
Преобразуйте этот массив таким образом, чтобы то, что было строками, стало столбцами и наоборот.
Внимание! Не надо менять структуру массива. Задание требует только переместить элементы массива.
Тип элементов массива может быть любой по вашему выбору.
 */
public class Main4 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };

        int[][] transposedArray = transposeArray(array);

        printArray(transposedArray);
    }
}
