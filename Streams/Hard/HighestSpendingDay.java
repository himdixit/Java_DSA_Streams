package Streams.Hard;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestSpendingDay {
    public static void main(String[] args) {
        List<Transaction> trans = List.of(
            new Transaction("1", LocalDate.of(2024, 1, 1), 500),
            new Transaction("1", LocalDate.of(2024, 1, 1), 500),
            new Transaction("1", LocalDate.of(2024, 1, 2), 500),
            new Transaction("1", LocalDate.of(2024, 1, 2), 200),
            new Transaction("1", LocalDate.of(2024, 1, 3), 100),
            new Transaction("1", LocalDate.of(2024, 1, 3), 300)
        );

        Map<LocalDate,Double> map= trans.stream().collect(Collectors.groupingBy(Transaction :: getDate, Collectors.summingDouble(Transaction :: getAmount)));
        map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).ifPresent(System.out :: print);
    }
}
