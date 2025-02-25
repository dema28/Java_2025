package Novicov.Review4;

public class Main2 {
    public static int countSubString(String str, String sub) {
        String s1 = str.toLowerCase();
        int result = 0;

        int index = 0;
        do {
            index = s1.indexOf(sub, index);
            if (index > -1) {
                System.out.println(index++);
                result++;
                index += sub.length();
            }
        } while (index != -1);
        return result;
    }
    public static void main(String[] args) {

        int count = countSubString("Посмотрите как Рите нравится ритм", "рит");
        System.out.println("Count: " + count);
        countSubString("Посмотрите как Рите нравится ритм", "р");

    }

}
