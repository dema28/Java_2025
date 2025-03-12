package Novicov.HomeWork08;

import java.util.Arrays;

public class SalaryUtils {
    public static double getTotalSalary(EmployeeSalary[] employees, Month[] months) {
        return Arrays.stream(employees).mapToDouble(e -> e.getSalary(months)).sum();
    }
}
