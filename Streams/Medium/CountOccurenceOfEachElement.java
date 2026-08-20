package Streams.Medium;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenceOfEachElement {
    public static void main(String[] args) {
        List<String> words = List.of("apple", "banana", "cherry", "date", "elderberry", "apple", "banana");

        words.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
            .forEach((word, count) -> System.out.println(word + ": " + count));

        words.stream()
            .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
            .forEach((word,count)-> System.out.println(word +"-> "+count));

        words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .forEach((word,count)-> System.out.println(word +"-> "+count));
    }
}
