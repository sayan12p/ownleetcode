package first.Array;

import java.util.Arrays;

public class SecondSmallest {

    public static void main(String[] args) {
        Integer[] arr=new Integer[]{3,4,67,9};
        System.out.println(Arrays.stream(arr).sorted().skip(1).findAny().get());
    }
}
