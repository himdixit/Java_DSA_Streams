package Streams.Easy;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

public class FilterEven {
    public static void main(String[] args) {
        // Create a stream of integers
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = integerStream.filter(e -> e % 2 == 0).collect(Collectors.toList());
        evenNumbers.forEach(System.out::println);
    }
}
