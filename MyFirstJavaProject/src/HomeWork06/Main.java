package HomeWork06;
/*
Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)
 */
public class Main {
    public static void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        char[] chars = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            if (c == 'о') {
                result.append(c);
            }
        }
        System.out.println(result.toString()); // выведет "ооооо"
    }
}
