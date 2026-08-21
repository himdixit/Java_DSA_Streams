package Streams.Hard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Streams.Medium.Employee;

public class EmployeeSalaryRangeGrouping {
    public static void main(String[] args) {
        List<Employee> list = List.of(
            new Employee("Alice", "HR", 20000),
            new Employee("Bob", "IT", 30000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 120000),
            new Employee("Eve", "Finance", 65000),
            new Employee("Him", "IT", 90000),
            new Employee("Aman", "IT", 40000)
        );
        Map<SalaryRange, List<Employee>> map =list.stream().collect(Collectors.groupingBy(
            (Employee e) -> {
                return getSalary(e);
            }
        ));

        System.out.println(map);
    }

    private static SalaryRange getSalary(Employee e) {
        double salary = e.getSalary();
        if (salary < 50000) {
            return SalaryRange.LOW;
        } else if (salary < 100000) {
            return SalaryRange.MEDIUM;
        }
        return SalaryRange.HIGH;
    }
}
