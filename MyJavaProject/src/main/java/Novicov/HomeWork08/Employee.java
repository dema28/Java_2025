package Novicov.HomeWork08;

public final class Employee extends BaseEmployee {
    private int age;
    private char gender;

    public Employee(String name, double dailySalary, int age, char gender) {
        super(name, dailySalary);
        this.age = age;
        this.gender = gender;
    }
}
