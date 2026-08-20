package Streams.Medium;

import java.util.List;
import java.util.stream.Collectors;

public class GroupOfWordsByLength {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry");

        words.stream()
            .collect(Collectors.groupingBy(String :: length))
            .forEach((length, l) -> System.out.println("Words of length " + length + ": " + l));
    }
}
