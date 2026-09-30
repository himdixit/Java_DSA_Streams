package StreamsPractice;

import StreamsPractice.pojo.Employee;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class AverageSalaryByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(1, "Amit", "IT", 120000),
                new Employee(2, "Rahul", "HR", 90000),
                new Employee(3, "Neha", "IT", 150000),
                new Employee(4, "Priya", "HR", 110000),
                new Employee(5, "Vikas", "Finance", 130000),
                new Employee(6, "Anita", "Finance", 125000)
        );

        Map<String, Double> collect = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

    }
}
