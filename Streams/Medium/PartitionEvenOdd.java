package Streams.Medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionEvenOdd {
    public static void main(String[] args) {
    List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    Map<Boolean, List<Integer>> partitioned = numbers.stream()
        .collect(Collectors.partitioningBy(e -> e % 2 == 0));

    System.out.println("Even numbers: " + partitioned.get(true));
    System.out.println("Odd numbers: " + partitioned.get(false));    

    numbers.stream()
        .collect(Collectors.partitioningBy(e -> e%2==0))
        .forEach((isEven, nums) -> {
            if(isEven) {
                System.out.println("Even numbers: " + nums);
            } else {
                System.out.println("Odd numbers: " + nums);
            }
        });
    }   
}
