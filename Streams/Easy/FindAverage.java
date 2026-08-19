package Streams.Easy;

import java.util.Arrays;
import java.util.List;

public class FindAverage {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.stream(nums)
            .average()
            .ifPresent(System.out::println);

        List<Integer> numsList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numsList.stream()
            .mapToInt(Integer::intValue)
            .average()
            .ifPresent(System.out::println);
    }
}
