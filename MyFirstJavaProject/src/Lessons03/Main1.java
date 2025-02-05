package Lessons03;

public class Main1 {
    public static void main(String[] args) {
        int x = 1;
        int y = 1;

        //or
        if (x == y || x + 2 > 3) {  // || = или
            System.out.println("or");
            System.out.println("напечатает если что-то из одного 'true'");
        }
        System.out.println("================================================================");
        //and
        if (x == y && x + 2 < 10) {    // && = и
            System.out.println("and");
            System.out.println("напечатает если оба выражения 'true'");
        }

//        boolean b = x != y;
//        System.out.println(b);
//        System.out.println(!b);
//        System.out.println(!(x == y));

        if (x < y) {
            System.out.println("true!");
        }
    }
}
