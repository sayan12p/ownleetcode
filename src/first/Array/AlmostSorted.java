package first.Array;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AlmostSorted {

    public static void almostSorted(List<Integer> arr) {
        // Write your code here
        Integer[] unsortedArray=arr.stream().toArray(Integer[]::new);
    Integer[] sortedArray=arr.stream().sorted().toArray(Integer[]::new);
    List<Integer> list=compare(unsortedArray,sortedArray);
    int firstindex=list.get(0);
    int lastindex=list.get(list.size()-1);
    }
    public static List<Integer> compare(Integer[] unsorted,Integer[] sorted){
       return IntStream.range(0,unsorted.length).filter(i->!sorted[i].equals(unsorted[i])).boxed().collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,1,2);
        almostSorted(list);

    }
}
