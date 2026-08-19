package Streams.Easy;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareEvenNumbers {
    public static void main(String[] args) {
        Stream<Integer> iStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        iStream
        .filter(e -> e%2 ==0)
        .map(e -> e*e)
        .collect(Collectors.toList())
        .forEach(e -> System.out.println(e));
    }
}
