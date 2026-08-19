package Streams.Easy;

import java.util.Arrays;

public class SumOrProduct {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 11, 9, 2, 4, 6, 8, 10};
        int sum = Arrays.stream(arr)
            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of all numbers: " + sum);

        int product = Arrays.stream(arr)
            .reduce(1, (a, b) -> a * b);
        System.out.println("Product of all numbers: " + product);
    }
}
