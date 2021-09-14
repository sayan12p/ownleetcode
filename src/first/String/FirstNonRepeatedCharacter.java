package first.String;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void countofCharacters(String s){
    Map<Character,Integer> frequencies=s.chars().boxed().collect(Collectors.toMap(k->Character.valueOf((char)k.intValue()),v->1,Integer::sum));
        List<Character> collect = frequencies.entrySet().stream().filter(entry -> entry.getValue() == 1).map(entry -> entry.getKey()).collect(Collectors.toList());
        collect.forEach(character -> System.out.println(character));
}
    public static void main(String[] args) {
       String s="abcabaz";
       countofCharacters(s);
    }
}
