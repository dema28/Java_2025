package Novicov.HomeWork08;

public class SalaryUtils {
    public static double getTotalSalary(Employee[] employees, Month[] months) {
        double total = 0;
        for (Employee employee : employees) {
            total += employee.getSalary(months);
        }
        return total;
    }
}
