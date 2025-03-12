package Novicov.HomeWork08;

import javax.net.ssl.ManagerFactoryParameters;

public final class Director extends Manager {
    private static final double BONUS_COEFFICIENT = 0.03; // Константа для надбавки

    public Director(String name, double dailySalary, int age, char gender, int numberOfSubordinates) {
        super(name, dailySalary, age, gender, numberOfSubordinates);
    }

    @Override
    public double getSalary(Month[] monthArray) {
        double baseSalary = super.getSalary(monthArray);
        return baseSalary * (1 + getNumberOfSubordinates() * BONUS_COEFFICIENT); // Используем константу
    }
}