package Streams.Medium;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 70000),
            new Employee("Eve", "Finance", 65000)
        );

        employees.stream()
            .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingDouble(Employee :: getSalary)))
            .forEach((department, avgSalary) -> System.out.println("Department: " + department + ", Average Salary: " + avgSalary));
    }
}
