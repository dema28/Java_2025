package Novicov.HomeWork06;
/*
Дан массив:
String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
 */
public class Main3 {
    public static void main(String[] args) {
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;

        for (String[] row : array) {
            if (!row[0].contains("е")) {
                count++;
            }
        }

        System.out.println("Количество массивов, не содержащих букву 'е': " + count);
    }
}
