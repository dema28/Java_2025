package Novicov.HomeWork07_3;
/*
Вам нужно удвоить целое число и вернуть его.
 */
public class MainCW_1 {
    public static void main(String[] args) {
        int number = 5;
        int doubledNumber = doubleNumber(number);
        System.out.println("Doubled number: " + doubledNumber);
    }

    public static int doubleNumber(int number) {
        return number * 2;
    }
}


/*
class Java {
  public static int doubleInteger(int i) {
    // Double the integer and return it!

    return i * 2;
  }
}
 */