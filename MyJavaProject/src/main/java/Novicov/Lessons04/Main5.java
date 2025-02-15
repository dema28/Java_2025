package Novicov.Lessons04;

public class Main5 {
    public static void main(String[] args) {
        boolean left = false;
        for (int i = 0; i < 10; i++) {
            if (left) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(j);
                }
            } else {
                for (int k = 5; k > 0; k--) {
                    System.out.print(k);
                }
            }
            left = !left;
            System.out.println();
        }
    }
}
