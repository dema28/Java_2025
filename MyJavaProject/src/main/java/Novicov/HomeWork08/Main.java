package Novicov.HomeWork08;

public class Main {
    public static void main(String[] args) {
        // Создаем объекты сотрудников
        Employee emp = new Employee("John", 100, 30, 'M');
        Manager manager = new Manager("Alice", 150, 35, 'F', 5);
        Director director = new Director("Bob", 200, 40, 'M', 10);

        // Массив месяцев
        Month[] months = {MonthUtils.JANUARY, MonthUtils.FEBRUARY};

        // Выводим зарплаты сотрудников
        System.out.println(emp.getName() + " salary: " + emp.getSalary(months));
        System.out.println(manager.getName() + " salary: " + manager.getSalary(months));
        System.out.println(director.getName() + " salary: " + director.getSalary(months));

        // Считаем общую зарплату всех сотрудников
        EmployeeSalary[] allEmployees = {emp, manager, director};  // Используем EmployeeSalary вместо BaseEmployee
        System.out.println("Total Salary for all employees: " + SalaryUtils.getTotalSalary(allEmployees, months));
    }
}
