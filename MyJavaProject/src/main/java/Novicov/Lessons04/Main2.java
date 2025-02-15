package Novicov.Lessons04;

import java.util.Random;

public class Main2 {
    static Random rand = new Random();
    public static void main(String[] args) {
        int summary;
        do {
            int kubik1 = rand.nextInt(6) +1;
            int kubik2 = rand.nextInt(6) +1;
            System.out.println("Trewen: " + kubik1 + "and " + kubik2);
            summary = kubik1 + kubik2;
        } while(summary != 7);
        System.out.println("Done!");
    }
}
