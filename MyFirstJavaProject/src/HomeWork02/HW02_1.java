package HomeWork02;

/**
 * Необходимо создать целочисленные переменные a и b, присвоить произвольные значения переменным на ваш выбор
 * и вывести результаты следующих операций с этими переменными: сложение,
 * умножение, вычитание, деление и остаток от деления.
 * Также сделать проверку на четность этих переменных и вывести результат.
 */

public class HW02_1 {
    public static void main(String[] args) {
        int a = 257;
        int b = 22;
        int result = a + b;
        int result1 = a - b;
        int result2 = a * b;
        int result3 = a / b;
        int result4 = a % b;
        double result5 = (double) a / b;

        System.out.println("Сумма чисел: " + result);
        System.out.println("Разность чисел: " + result1);
        System.out.println("Произведение чисел: " + result2);
        System.out.println("Частное чисел: " + result3);
        System.out.println("Остаток от деления: " + result4);
        System.out.println("Дробное частное чисел: " + result5);
        System.out.println("Число " + a + " является четным: " + (a % 2 == 0));
        System.out.println("Число " + b + " является четным: " + (b % 2 == 0));
    }
}
