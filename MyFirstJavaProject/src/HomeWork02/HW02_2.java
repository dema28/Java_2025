package HomeWork02;

/**
 * Необходимо создать целочисленные переменные a и b,
 * присвоить им произвольные значения, а потом поменять значения местами
 * (значение переменной, a должно оказаться в переменной b и наоборот).
 */
public class HW02_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
}
