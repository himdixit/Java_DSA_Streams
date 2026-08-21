package Streams.Hard;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TopFrequentWords {

    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog. The dog barked at the fox. The fox ran away from the dog.";
        Stream<String> stream = Arrays.stream(s.replaceAll("[^a-zA-Z ]", "").split(" "));
        stream.map(String :: toLowerCase)
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        .entrySet().stream().sorted(Comparator.comparing(Map.Entry :: getValue, Comparator.reverseOrder()))
        .map(Map.Entry :: getKey)
        .limit(3)
        .forEach(System.out :: println);
    }
}

