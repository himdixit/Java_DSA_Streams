package Streams.Easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreams {
    public static void main(String[] args) {
        // Create a stream from a collection
        List<String> list = Arrays.asList("apple", "banana", "cherry");
        Stream<String> streamFromCollection = list.stream();
        streamFromCollection.forEach(System.out::println);

        // Create a stream from an array
        String[] array = {"dog", "cat", "rabbit"};
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);

        // Create a stream from values
        Stream<Integer> streamFromValues = Stream.of(1, 2, 3, 4, 5);
        streamFromValues.forEach(System.out::println);

        // Create an infinite stream
        Stream<Double> infiniteStream = Stream.generate(Math::random);
        infiniteStream.limit(5).forEach(System.out::println);
    }
}