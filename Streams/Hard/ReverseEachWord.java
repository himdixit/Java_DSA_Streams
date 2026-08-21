package Streams.Hard;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseEachWord {
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog. The dog barked at the fox. The fox ran away from the dog.";
        Stream<String> stream = Arrays.stream(s.replaceAll("[^a-zA-Z ]", "")
                                      .split(" "));
        //stream.map( e -> new StringBuilder(e).reverse())
        stream.map(e -> Arrays.stream(e.split("")).reduce("",(rev,ch)-> ch+rev))
        .forEach(System.out :: println);

    }
}
