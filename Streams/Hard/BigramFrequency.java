package Streams.Hard;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BigramFrequency {
    public static void main(String[] args) {
        String input = "The quick, brown fox jumps over the lazy dog!";

        String[] words = input.toLowerCase().replaceAll("[^a-z ]","").split(" ");
        Arrays.stream(words).forEach(System.out:: println);
        List<String> list = IntStream.range(0, words.length -1)
                .mapToObj(i-> words[i]+" "+words[i+1])
                .toList();
        System.out.println(list);
    }
    
}
