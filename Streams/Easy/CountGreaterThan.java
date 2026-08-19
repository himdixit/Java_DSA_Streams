package Streams.Easy;

import java.util.Arrays;

public class CountGreaterThan {
    public static void main(String[] args){
        int[] arr = {5, 3, 1, 7, 11, 9, 2, 4, 6, 8, 10};
        long count = Arrays.stream(arr)
            .filter(e -> e > 5)
            .count();
        System.out.println("Count of numbers greater than 5: " + count);
    }
}
