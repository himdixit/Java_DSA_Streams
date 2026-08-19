package Streams.Easy;

import java.util.Comparator;
import java.util.List;

public class FindMaximum {
       public static void main(String[] args) {
        List<Integer> nums = List.of(5, 3, 1, 7, 11, 9, 2, 4, 6, 8, 10);
        nums.stream()
            .sorted(Comparator.reverseOrder())
            .findFirst()
            .ifPresent(System.out::println);
        
        int max = nums.stream()
            .reduce(0, (a, b) -> Integer.max(a, b));
        System.out.println("Maximum value: " + max);

        nums.stream()
            .reduce(Integer::max)
            .ifPresent(System.out::println);

        nums.stream()
            .max(Integer :: compareTo)
            .ifPresent(System.out::println);

        nums.stream()
            .max(Comparator.naturalOrder())
            .ifPresent(System.out::println);

        nums.stream()
            .min(Comparator.reverseOrder())
            .ifPresent(System.out::println);
       }
}
