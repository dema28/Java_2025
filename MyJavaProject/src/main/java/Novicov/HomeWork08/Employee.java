package Novicov.HomeWork08;

public class Employee {
    private String name;
    private int age;
    private String gender;
    private double dailySalary;

    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public Employee(String name, int age, String gender, double dailySalary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.dailySalary = dailySalary;
    }

    public double getSalary(Month[] monthArray) {
        double totalSalary = 0;
        for (Month month : monthArray) {
            totalSalary += dailySalary * month.getWorkDays();
        }
        return totalSalary;
    }

    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(name, age, gender, dailySalary, numberOfSubordinates);
    }

    // Getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getGender() { return gender; }
    public double getDailySalary() { return dailySalary; }
}
