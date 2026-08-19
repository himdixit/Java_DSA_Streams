package Streams.Easy;

import java.util.List;

public class FlattenList {
    public static void main(String[] args) {
        List<List<Integer>> listOfLists = List.of(
            List.of(1, 2, 3),
            List.of(4, 5, 6),
            List.of(7, 8, 9)
        );
        System.out.println(listOfLists);
        List<Integer> flattenedList = listOfLists.stream()
            .flatMap(List::stream)
            .toList();
        System.out.println(flattenedList);
    }
}
