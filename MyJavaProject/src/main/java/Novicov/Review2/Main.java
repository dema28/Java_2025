package Novicov.Review2;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        boolean isEven  = (a % 2 == 0);
        int result = 0;

        System.out.println(result);
        if (isEven) {
            result = a * 3;
        } else {
            result = a * 2;
        }
        System.out.println(result);
    }
}
