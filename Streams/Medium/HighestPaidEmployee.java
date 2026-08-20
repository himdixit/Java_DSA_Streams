package Streams.Medium;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 70000),
            new Employee("Eve", "Finance", 65000)
        );

        employees.stream()
            .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.maxBy(Comparator.comparingDouble(Employee :: getSalary))))
            .forEach((department, employee) -> System.out.println("Department: " + department + ", Highest Paid Employee: " + employee.get().getName() + ", Salary: " + employee.get().getSalary()));
    }
}
