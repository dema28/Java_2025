package Novicov.HomeWork08;

public class Director extends Manager {
    public Director(String name, int age, String gender, double dailySalary, int numberOfSubordinates) {
        super(name, age, gender, dailySalary, numberOfSubordinates);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray);
        return baseSalary * (1 + 0.03 * getNumberOfSubordinates());
    }
}
