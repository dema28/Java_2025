package Novicov.Lessons10;

public class Calculator {

    public double add(int a, int b) {
        return a + b;
    }

    public double add(int a, float b) {
        return a + b;
    }

    public double add(float a, int b) {
        return a + b;
    }

    public static  void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3)); // Output: 8
        System.out.println(calculator.add(5, 3.5f)); // Output: 8.5
        System.out.println(calculator.add(5.5f, 3)); // Output: 8.5
    }

}
