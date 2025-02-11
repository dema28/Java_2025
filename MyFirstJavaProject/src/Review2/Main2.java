package Review2;

public class Main2 {
    public static void main(String[] args) {
        int a = 11;
        boolean isEven = (a % 2) == 0;
        int result = 0;

        if (a < 0) {
            System.out.println("negative");
        } else if (a < 10) {
            System.out.println("a single digit");
        } else if (a < 20) {
            System.out.println("greater or equal to 10");
        } else {
            System.out.println("greater than 19");
        }
    }
}
