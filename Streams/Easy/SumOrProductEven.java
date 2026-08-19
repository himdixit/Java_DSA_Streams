package Streams.Easy;
import java.util.Arrays;

public class SumOrProductEven {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 7, 11, 9, 2, 4, 6, 8, 10};
        int sum = Arrays.stream(arr)
            .filter(e -> e % 2 == 0)
            .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of even numbers: " + sum);

        int product = Arrays.stream(arr)
            .filter(e -> e % 2 == 0)
            .reduce(1, (a, b) -> a * b);
        System.out.println("Product of even numbers: " + product);

        int sum1 = Arrays.stream(arr)
            .filter(e -> e % 2 == 0)
            .sum();
        System.out.println("Sum of even numbers (using sum()): " + sum1);
    }
}