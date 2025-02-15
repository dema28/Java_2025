package Novicov.HomeWork06;
/*
Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        int index = s.toLowerCase().indexOf("рит");
        while (index != -1) {
            System.out.println(index);
            index = s.toLowerCase().indexOf("рит", index + 1);
        }
    }
}
