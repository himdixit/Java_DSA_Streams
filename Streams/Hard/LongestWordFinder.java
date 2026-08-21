package Streams.Hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LongestWordFinder {
    public static void main(String[] args) {
        String input = "The quick, brown fox jumps over the lazy dog!";
        Stream<String> stream = Arrays.stream(input.replaceAll("[^a-zA-Z ]", "")
                                                .split(" "));
        stream.max(Comparator.comparingInt(String::length)).ifPresent(System.out::println);
    }
}
