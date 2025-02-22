package Novicov.HomeWork08;

public class Manager extends Employee {
    private int subordinates;

    public Manager(String name, int age, String gender, double dailySalary, int subordinates) {
        super(name, age, gender, dailySalary);
        this.subordinates = subordinates;
    }

    public int getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(int subordinates) {
        this.subordinates = subordinates;
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray);
        return baseSalary + (baseSalary * subordinates * 0.01);
    }
}