package first.Array;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        return Arrays.stream(nums).distinct().findAny().getAsInt();
    }
    public static void main(String[] args) {
    int nums[]={1};
        System.out.println(singleNumber(nums));
    }
}
