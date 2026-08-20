package Streams.Medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }
}
public class DepartmentEmployeeCount {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 70000),
            new Employee("Eve", "Finance", 65000),
             new Employee("Him", "IT", 90000)
        );

        Map<String, Long> mp = employees.stream()
            .collect(Collectors.groupingBy(Employee :: getDepartment, Collectors.counting()));
        
        mp.entrySet().stream()
        .filter(entry -> entry.getValue() > 2)
        .forEach(entry -> System.out.println("Department: " + entry.getKey() + ", Employee Count: " + entry.getValue()));

        List<String> filteredEntries = mp.entrySet().stream()
        .filter(entry -> entry.getValue() > 2)
        .map(Map.Entry :: getKey)
        .toList();

        System.out.println("Departments with more than 2 employees:"+filteredEntries);
    }
}
