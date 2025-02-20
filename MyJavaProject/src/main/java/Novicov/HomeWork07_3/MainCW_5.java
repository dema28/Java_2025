package Novicov.HomeWork07_3;
/*
If you can't sleep, just count sheeps!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...".
Input will always be valid, i.e. no negative integers.

 */

public class MainCW_5 {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countSheep(n));
    }

    public static String countSheep(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            result.append(i).append(" sheep... ");
        }
        return result.toString().trim();
    }
}

/*
class Kata {
  public static String countingSheep(int num) {
  StringBuilder result = new StringBuilder();
    for (int i = 1; i <= num; i++) {
        result.append(i).append(" sheep...");
    }
    return result.toString();
  }
}
 */
