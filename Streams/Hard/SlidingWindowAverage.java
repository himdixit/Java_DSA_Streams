package Streams.Hard;

import java.util.List;
import java.util.stream.IntStream;

public class SlidingWindowAverage {
    public static void main(String[] args) {
        List<Integer> input = List.of(4, 8, 15, 16, 23, 42, 12, 7, 9, 10);
        int windowSize = 3;
        IntStream.range(0,input.size() - (windowSize - 1))
            .mapToDouble(i -> input.subList(i, i + windowSize).stream().mapToInt(Integer::intValue).average().orElse(0.0))
            .forEach(System.out::println);

        IntStream.range(0, input.size() - (windowSize -1))
            .mapToObj(i -> input.subList(i, i + windowSize))
            .map(sublist -> sublist.stream().mapToInt(Integer::intValue).average().orElse(0.0))
            .forEach(System.out::println);
    }
}
