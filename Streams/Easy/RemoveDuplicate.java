package Streams.Easy;

import java.util.List;

public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5);
        nums.stream()
            .distinct()
            .toList()
            .forEach(System.out::println);
    }
}
