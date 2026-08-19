package Streams.Easy;

import java.util.List;

public class EvenSquaredSum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = nums.stream()
            .filter(e -> e%2 !=0)
            .map(e->e*e)
            .reduce(0, Integer::sum);
        System.out.println(sum);

        int sum1 = nums.stream()
            .filter(e -> e%2 !=0)
            .mapToInt(e -> e * e)
            .sum();
        System.out.println(sum1);
    }
}
