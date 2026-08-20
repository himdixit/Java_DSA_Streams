package Streams.Medium;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployeesBySalary {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
        new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 70000),
            new Employee("Eve", "Finance", 65000));

        List<Employee> sortedEmployees = employees.stream()
            .sorted(Comparator.comparingDouble(Employee::getSalary))
            .collect(Collectors.toList());
        
        System.out.println("Employees sorted by salary:");
        sortedEmployees.forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));

        System.out.println("Employees sorted by salary (using lambda):");
        employees.stream()
            .sorted((a,b) -> (int)(a.getSalary()-b.getSalary()))
            .forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));

        System.out.println("Employees sorted by salary (using method reference):");
        employees.stream()
            .sorted(Comparator.comparing(Employee :: getSalary))
            .forEach(e -> System.out.println(e.getName() + ": " + e.getSalary()));
    }
}
