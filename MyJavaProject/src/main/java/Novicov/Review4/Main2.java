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

    /*
    Закоментированный код относится к верхней части кода.
     */
//    public static void main(String[] args) {
//
//        int count = countSubString("Посмотрите как Рите нравится ритм", "рит");
//        System.out.println("Count: " + count);
//        countSubString("Посмотрите как Рите нравится ритм", "р");
//
//    }

    /*
    Нижний код он самостоятельный.
     */
    public static void main(String[] args) {
        int sum = (sum(1, sum(3, 2)));
        System.out.println(sum);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

}
