import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        String s="welcome to java world";
        LinkedHashMap<Character,Long> map=s.trim().chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(a->a,LinkedHashMap::new ,Collectors.counting()));
        //System.out.println(map.entrySet().stream().filter(e->e.getValue()>1).filter(e->e.getKey()!= ' ').map(e->e.getKey()).findFirst().get());

        List<String> list= Arrays.asList("pen","pen","pencil","book","pen");
        LinkedHashMap<String,Long> listmap=list.stream().collect(Collectors.groupingBy(i->i,LinkedHashMap::new, Collectors.counting()));
        //System.out.println(listmap.entrySet().stream().filter(b->b.getValue()>1).collect(Collectors.toMap(b->b.getKey(),b->b.getValue())));

        String a="hello";
        LinkedHashMap<Character,Long> map1=
                a.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,LinkedHashMap::new,Collectors.counting()));
        System.out.println(map1.entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get());
    }
}
