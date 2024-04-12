package first.String;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void countofCharacters(String s){
//    Map<Character,Integer> frequencies=s.chars().boxed().collect(Collectors.toMap(k->Character.valueOf((char)k.intValue()),v->1,Integer::sum));
//        List<Character> collect = frequencies.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).collect(Collectors.toList());
//        collect.forEach(character -> System.out.println(character));
        LinkedHashMap<Character, Long> collect = s.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(collect.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst().get());
    }
    public static void main(String[] args) {
       String s="abcabaz";
       countofCharacters(s);
    }
}
