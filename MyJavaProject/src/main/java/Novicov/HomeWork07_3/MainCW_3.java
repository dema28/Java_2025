package Novicov.HomeWork07_3;
/*
Нам нужна функция, которая может преобразовать число (целое число) в строку.

Какие способы достижения этого вы знаете?

Примеры (вход -> выход):
123  --> "123"
999  --> "999"
-100 --> "-100"
 */
public class MainCW_3 {

    public static String convertNumberToString(int number) {
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        System.out.println(convertNumberToString(123)); // "123"
        System.out.println(convertNumberToString(999)); // "999"
        System.out.println(convertNumberToString(-100)); // "-100"
    }
}

/*
class Kata {
  public static String numberToString(int num) {
    return num + ""; // Return a string of the number here!
  }
}

 */