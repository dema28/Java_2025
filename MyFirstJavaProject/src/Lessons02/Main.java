package Lessons02;

public class Main {
    public static void main(String[] args) {
        int regular = 30;
        int doppel = 10;
        int leut = 1;
        int capitan = 1;
        int arhers = 2;
        int baseSalary = 4;

        int totalSalary = regular * baseSalary + (doppel + arhers) * baseSalary * 2 + leut * baseSalary * 10 + capitan * baseSalary * 100;

        System.out.println("Total salary: " + totalSalary);
    }
}
