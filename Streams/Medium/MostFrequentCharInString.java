package Streams.Medium;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentCharInString {
    public static void main(String[] args) {
        String s="HelloWorld";
        Optional<Map.Entry<Character, Long>> mostFrequentChar = s.chars()
         .mapToObj(c -> (char) c)
         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
         .entrySet().stream().max(Map.Entry.comparingByValue());

        mostFrequentChar.ifPresent(entry -> System.out.println("Most frequent character: " + entry.getKey() + ", Count: " + entry.getValue()));
    }
}
