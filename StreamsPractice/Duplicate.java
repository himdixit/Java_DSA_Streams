package StreamsPractice;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Duplicate{
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 25, 8, 45, 32, 45, 18, 25);
        Map<Integer, Long> maps = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        List<Integer> duplicates = maps.entrySet().stream().filter(e -> e.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        //System.out.println(duplicates);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates1=numbers.stream().filter( e -> !seen.add(e)).toList();
        System.out.println(duplicates1);

    }
}