package first.String;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCharacters {
    public static void main(String[] args) {
        String s = "Hello Sayan welcome to the Java Java";
        Map<Character, Long> collect = Arrays.stream(s.split(" ")).
                map(i->i.chars()).flatMap(c->c.mapToObj(i->(char)i)).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(collect);
        List<String> s1=Arrays.stream(s.split(" ")).collect(Collectors.toList());
        System.out.println(s1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        String s2="helloho";
        LinkedHashMap<Character, Long> collect1 = s2.chars().mapToObj((c -> (char) c)).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect1.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findAny().get());
    }
}
