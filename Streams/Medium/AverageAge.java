package Streams.Medium;

import java.util.List;
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
public class AverageAge {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Alice", 30),
            new Person("Bob", 25),
            new Person("Charlie", 35)
        );

        people.stream()
            .mapToInt(e -> e.getAge())
            .average()
            .ifPresent(System.out::println);

        people.stream()
            .mapToInt(Person::getAge)
            .average()
            .ifPresent(System.out::println);
    }
}
