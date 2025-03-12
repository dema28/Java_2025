package Novicov.HomeWork08;

public class Manager extends BaseEmployee {
    private final int numberOfSubordinates;
    private static final double BONUS_COEFFICIENT = 0.01; // Константа для надбавки

    public Manager(String name, double dailySalary, int age, char gender, int numberOfSubordinates) {
        super(name, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = super.getSalary(monthArray);
        return salary * (1 + numberOfSubordinates * BONUS_COEFFICIENT); // Используем константу
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }
}