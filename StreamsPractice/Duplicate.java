package StreamsPractice;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Duplicate{
    public static void main(String[] args) {
        List<Integer> numbers =
        Arrays.asList(10, 25, 8, 45, 32, 45, 18, 25);

        List<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(duplicates);
        
    }
}