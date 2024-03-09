package first.String;

import java.util.*;
import java.util.stream.Collectors;

public class LongestString {

    public static void main(String[] args) {
        String arr[] =new String[]{"hello","good","hello","good","yellow"};
        Set<String> set=new HashSet<>();
        List<String> map=Arrays.stream(arr)
                .filter(s->set.add(s))
                .collect(Collectors.toMap(s->s.length(), s->s,(e1, e2)->e1,LinkedHashMap::new)).entrySet().stream()
                .map(i->i.getValue()).collect(Collectors.toList());
        System.out.println(map);
    }
}
