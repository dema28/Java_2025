package Novicov.Review4;

public class Main1 {
    public static void main(String[] args) {
        countSubString("Посмотрите как Рите нравится ритм", "рит");
    }

    public static void countSubString(String str, String sub) {
        String s1 = str.toLowerCase();
        String s2 = sub.toLowerCase();

        int index = 0;
        int count = 0;

        while ((index = s1.indexOf(s2, index)) != -1) {
            System.out.println("Index: " + index);
            index += s2.length(); // Сдвигаем индекс дальше найденного подслова
            count++;
        }

        System.out.println("Total occurrences: " + count);
    }
}
