package Novicov.HomeWork08;

public class Manager extends Employee {
    private int numberOfSubordinates;

    public Manager(String name, int age, String gender, double dailySalary, int numberOfSubordinates) {
        super(name, age, gender, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray);
        return baseSalary * (1 + 0.01 * numberOfSubordinates);
    }

    public int getNumberOfSubordinates() { return numberOfSubordinates; }
}
