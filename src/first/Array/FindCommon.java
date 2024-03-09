package first.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindCommon {

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{2,4,3};
        Integer[] arr1=new Integer[]{2,3,11};
       List<Integer> list1= Arrays.stream(arr).collect(Collectors.toList());
       List<Integer> list2=Arrays.stream(arr1).collect(Collectors.toList());
       List<Integer> common=list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(common);
    }
}
