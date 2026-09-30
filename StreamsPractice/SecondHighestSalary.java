package StreamsPractice;

import StreamsPractice.pojo.Employee;

import java.util.*;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "IT", 120000),
                new Employee(2, "Rahul", "HR", 90000),
                new Employee(3, "Neha", "IT", 150000),
                new Employee(4, "Priya", "HR", 110000),
                new Employee(5, "Vikas", "Finance", 130000),
                new Employee(6, "Anita", "Finance", 125000),
                new Employee(7, "Rohit", "IT", 150000)
        );

       OptionalDouble second= employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).mapToDouble(Employee::getSalary).distinct()
                .skip(1).findFirst();
       System.out.println(second);

        Optional<Double> second1 =
                employees.stream()
                        .map(Employee::getSalary)
                        .distinct()
                        .sorted(Comparator.reverseOrder())
                        .skip(1)
                        .findFirst();
        System.out.println(second1);
    }
}
