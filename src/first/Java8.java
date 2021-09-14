package first;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8 {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"sayan");
        map.put(2,"shubham");
        //map.forEach((k,v)->System.out.println(k +" " +v));
        //IntStream.range(0,10).forEach(i->{i=i*2; System.out.println(i);});
        List<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(new Integer[]{1,2,3,8,9,6,65,64}));
        List<Integer> list1=new ArrayList<>();
        list1.addAll(Arrays.asList(new Integer[]{2,3,4}));
        /*List<Integer> result=list1.stream().filter(list::contains).collect(Collectors.toList());*/
        List<Integer> result=list1.stream().filter(i->list.contains(i)).collect(Collectors.toList());
        System.out.println(result);
        Stream<Integer> intstream= IntStream.range(0, 10).boxed();
        int[] array= intstream.mapToInt(x -> x).toArray();
        System.out.println(Arrays.stream(array).toString());
        List<String> money=Arrays.asList("1230,00","3456,00");
         List<String> resultmoney=money.stream().map(s -> s.replaceAll(",",".")).collect(Collectors.toList());
        System.out.println(resultmoney);
        String[] array1={"sayan","shubham","rishi"};
        String[] array2={"sumit"};
        String[] resultarray=Stream.concat(Arrays.stream(array1),Arrays.stream(array2)).toArray(String[]::new);
        System.out.println(Arrays.toString(resultarray));
        List<Integer> numberlist=new ArrayList<>();
        numberlist.addAll(Arrays.asList(new Integer[]{1123,2456,3789}));
        IntStream stream = numberlist.stream().mapToInt(i->i);
        int s=stream.min().getAsInt();
        IntStream intStream=Arrays.stream(new int[]{4,5,6});
        int resultto=intStream.filter(x->x>5).reduce((left,right) -> left+7).getAsInt();
        System.out.println(resultto);
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("sayan",1);
        hashMap.put("shubham",2);
        Set<Map.Entry<String,Integer>> set=hashMap.entrySet();
        for(Map.Entry<String,Integer> me:set){
            System.out.println(me.getKey()+" "+me.getValue());
        }
        List<Integer> sayanlist=new ArrayList<>();
        sayanlist.addAll(Arrays.asList(new Integer[]{1,2,3,8,9,6,65,64}));
        Integer sdf=sayanlist.stream().min(Comparator.comparingInt(value -> -value)).get();
        sayanlist.removeIf(integer -> integer.equals(sdf));
        System.out.println(sayanlist.toString());
        int[] numarray=new int[]{12,12,14,14,15,16,15,19,16};
        Set<Integer> numset=new HashSet<>();
        for(int i=0;i<numarray.length;i++){
            numset.add(numarray[i]);
        }
        System.out.println(numset);
    }
    /*Comparator<Person> comparator = Comparator.comparing(person -> person.name);
    comparator = comparator.thenComparing(Comparator.comparing(person -> person.age));*/
}
