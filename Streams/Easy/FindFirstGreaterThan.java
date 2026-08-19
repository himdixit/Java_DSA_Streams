package Streams.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstGreaterThan {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 3, 1, 7, 11, 9, 2, 4, 6, 8, 10);
        Optional<Integer> result = nums.stream()
            .filter(e -> e > 5)
            .skip(3)
            .findFirst();
        if(result.isPresent()) {
            System.out.println("First number greater than 5: " + result.get());
        } else {
            System.out.println("No number greater than 5 found.");
        }
    }
}
