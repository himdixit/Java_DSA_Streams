package StreamsPractice;
import java.util.Arrays;

public class Sum {
    public static void main(String[] args) {
        int x = 16745;

        String s = "" + x;

        String[] sArr = s.split("");

        double d = Arrays.stream(sArr)
                .mapToInt(Integer::parseInt)
                .reduce(0, (a, b) -> a + b);

        System.out.print(d);
    }
}