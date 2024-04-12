package first.String;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacters {
    public static void main(String[] args) {
        String s = "Hello Sayan welcome to the Java World";
        Map<Character, Long> collect = Arrays.stream(s.split(" ")).
                map(i->i.chars()).flatMap(c->c.mapToObj(i->(char)i)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(collect);
    }
}
