package Lessons03;

public class Main {
    public static void main(String[] args) {
        int h1 = 65;
        int hCounter = 40;
        int baseSalary = 1000;

        int payment = baseSalary + (h1 * hCounter);
        System.out.println();

        if (payment < 2000) {
            System.out.println("меньше");
        }else{
            System.out.println(payment);
            if (payment > 3000)
                payment = payment - (payment /100 * 3);
            System.out.println(payment);
        }
    }
}
