package Streams.Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinString {
    public static void main(String[] args) {
        String[] words = {"Hello", "World", "Java", "Streams"};
        String result = Arrays.stream(words)
            .reduce("", (s1, s2) -> s1 + " " + s2);
        System.out.println(result);

        String result1 = Arrays.stream(words)
            .collect(Collectors.joining(","));
        System.out.println(result1);

        String result2 = Arrays.stream(words)
            .collect(Collectors.joining(", ","[","]"));
        System.out.println(result2);
    }
}
