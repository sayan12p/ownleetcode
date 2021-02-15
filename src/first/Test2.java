package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test2 {
    public void takeDistinct() {
        Integer[] arr1 = new Integer[]{1, 2, 3};
        Integer[] arr2 = new Integer[]{1, 2};

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.addAll(Arrays.asList(arr1));
        list2.addAll(Arrays.asList(arr2));
        List<Integer> result=list1.stream().distinct().filter(list2::contains).collect(Collectors.toList());
        System.out.println(result);
    }

    public static void main(String[] args) {
        Test2 t2=new Test2();
        t2.takeDistinct();
    }
}
