package Novicov.HomeWork08;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 30, "Male", 100);
        Manager manager = new Manager("Alice", 35, "Female", 150, 5);
        Director director = new Director("Bob", 40, "Male", 200, 10);

        Month[] months = {MonthUtils.JANUARY, MonthUtils.FEBRUARY};

        System.out.println(emp.getName() + " salary: " + emp.getSalary(months));
        System.out.println(manager.getName() + " salary: " + manager.getSalary(months));
        System.out.println(director.getName() + " salary: " + director.getSalary(months));

        Employee[] allEmployees = {emp, manager, director};
        System.out.println("Total Salary for all employees: " + SalaryUtils.getTotalSalary(allEmployees, months));
    }
}
