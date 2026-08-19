package Streams.Easy;

import java.util.Arrays;

public class CountStartsWithA {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hannah", "Isabella", "Jack"};
        long count= Arrays.stream(names)
            .filter(name -> name.startsWith("A"))
            .count();
        System.out.println(count);
    }
}
