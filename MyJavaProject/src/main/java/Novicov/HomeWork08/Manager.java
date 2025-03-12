package Novicov.HomeWork08;

public final class Manager extends BaseEmployee {
    private int numberOfSubordinates;

    public Manager(String name, double dailySalary, int age, char gender, int numberOfSubordinates) {
        super(name, dailySalary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = super.getSalary(monthArray);
        return salary * (1 + numberOfSubordinates * 0.01); // бонус за подчиненных
    }
}
