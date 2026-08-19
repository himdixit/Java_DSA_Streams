package Streams.Easy;

import java.util.Arrays;

public class CheckAllPositive {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        boolean allPositive = Arrays.stream(numbers)
            .allMatch(n -> n > 0);
        System.out.println("All numbers are positive: " + allPositive);
    }
}