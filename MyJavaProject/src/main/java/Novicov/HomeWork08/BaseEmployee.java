package Novicov.HomeWork08;

public abstract class BaseEmployee implements EmployeeSalary {
    private String name;
    private double dailySalary;

    public BaseEmployee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double salary = 0;
        for (Month month : monthArray) {
            salary += dailySalary * month.getWorkDays();
        }
        return salary;
    }

    @Override
    public String getName() {
        return name;
    }

    public double getDailySalary() {
        return dailySalary;
    }
}
