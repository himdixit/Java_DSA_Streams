package Streams.Medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestAvgSalaryDepartment{
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 70000),
            new Employee("Eve", "Finance", 65000),
             new Employee("Him", "IT", 90000)
        );

       employees.stream()
        .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.averagingDouble(Employee :: getSalary)))
        .entrySet().stream().max(Map.Entry.comparingByValue())
        .ifPresent(entry -> System.out.println("Department with highest average salary: " + entry.getKey() + ", Average Salary: " + entry.getValue()));
    }
}