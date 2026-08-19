package Streams.Easy;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SquareNumbers {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5);
        List<Integer> squares = integerStream.map(e -> e*e).collect(Collectors.toList());
        squares.forEach(System.out::println);
    }
}
