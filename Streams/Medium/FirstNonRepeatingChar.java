package Streams.Medium;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "swiss";
        // Implementation for finding the first non-repeating character
        Optional<Entry<Character,Long>> first = input.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap :: new, Collectors.counting()))
            .entrySet().stream()
            .filter(e -> e.getValue() ==1)
            .findFirst();
        if(first.isPresent()){
            System.out.println("First non-repeating character: " + first.get().getKey());
        } else {
            System.out.println("No non-repeating character found.");
        }
    }
}
