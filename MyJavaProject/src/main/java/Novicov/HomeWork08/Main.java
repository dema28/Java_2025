package Novicov.HomeWork08;

public class Main {
    public static void main(String[] args) {
        Month[] months = {MonthUtils.JANUARY, MonthUtils.FEBRUARY, MonthUtils.MARCH};

        Employee employee = new Employee("Иван", 30, "Мужской", 100);
        Manager manager = new Manager("Анна", 35, "Женский", 150, 5);

        System.out.println(employee.getName() + " зарплата: " + employee.getSalary(months));
        System.out.println(manager.getName() + " зарплата: " + manager.getSalary(months));
    }
}