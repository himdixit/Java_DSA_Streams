package StreamsPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers =
                Arrays.asList(10, 25, 8, 45, 32, 45, 18, 25, 50);

        Optional<Integer> secHighest=numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        System.out.println(secHighest);
    }
}
