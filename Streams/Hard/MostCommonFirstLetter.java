package Streams.Hard;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import Streams.Medium.Employee;

public class MostCommonFirstLetter {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Alice", "HR", 50000),
            new Employee("Bob", "IT", 60000),
            new Employee("Charlie", "HR", 55000),
            new Employee("David", "IT", 70000),
            new Employee("Eve", "Finance", 65000),
            new Employee("Him", "IT", 90000),
            new Employee("Aman", "IT", 40000)
        );

        Map<Character, Long> map = employees.stream()
            .map(e -> e.getName().charAt(0))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        map.entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .ifPresent(e -> System.out.println(e.getKey()));
          
    }
}