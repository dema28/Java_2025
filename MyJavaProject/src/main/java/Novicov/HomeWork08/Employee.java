package Novicov.HomeWork08;

public final class Employee extends BaseEmployee {
    private int age;
    private char gender;

    public Employee(String name, double dailySalary, int age, char gender) {
        super(name, dailySalary);
        this.age = age;
        this.gender = gender;
    }

    // Добавляем методы set
    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Добавляем метод convertToManager
    public Manager convertToManager(int numberOfSubordinates) {
        return new Manager(this.getName(), this.getDailySalary(), this.age, this.gender, numberOfSubordinates);
    }

    // Геттеры для age и gender
    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }
}