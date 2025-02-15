package Novicov.HomeWork04;
/*
Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
Реализовать 2 варианта:
использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
без использования конструкции if (шаг цикла на ваше усмотрение).

 */
public class HW04_2 {
    public static void main(String[] args) {

        int i = 40;
        while (i <= 60) {
            if (i % 4 == 0) {
                System.out.print(i);
                System.out.print(" ");
            }
            i++;
        }
        System.out.println("\n********************************");
        // без if
        i = 40;
        while (i <= 60) {
            System.out.print((i % 4 == 0)?i : "-");
            i++;
        }
    }
}
