package HomeWork04;
/*
Необходимо вывести все положительные степени числа 5 до тех пор,
пока результат возведения в степень меньше 100000, вывести результат возведения в степень.
 */
public class HW04_1 {
    public static void main(String[] args) {
        int num = 5;
        int power = 1;

        while (Math.pow(num, power) < 100000) {
            System.out.println(num + " в степени " + power + " равно: " + Math.pow(num, power));
            power++;
        }
    }
}
