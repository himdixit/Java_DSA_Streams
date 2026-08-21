package Streams.Hard;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupCharacters {
    public static void main(String[] args) {
        List<Character> list = List.of('C', 'a', '4', 'Z', '!');

        Map<String,List<Character>> map= list.stream().collect(Collectors.groupingBy(ch -> getCharacterType(ch)));
        System.out.println(map);
    }

    private static String getCharacterType(Character ch)
    {
        if(Character.isDigit(ch))
            return "Digit";
        if(Character.isLowerCase(ch))
            return "Lowercase";
        if(Character.isUpperCase(ch))
            return "Uppercase";
        return "Special";
    }
}
