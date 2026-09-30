package StreamsPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedElement {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 25, 8, 45, 32, 25, 8, 50, 45);
        Optional<Integer> firstRepeated = numbers.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() > 1)
                .map(e -> e.getKey())
                .findFirst();
        System.out.println(firstRepeated);
    }

}
