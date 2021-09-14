package first.Array;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {

        int [] result=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int productremaining = findremaining(nums, i).reduce(1,(a, b)->a*b);
            result[i]=productremaining;
        }

        return result;
    }
        public static Stream<Integer> findremaining(int[] nums, int i) {
           return  Arrays.stream(nums).filter(x->!(x==nums[i])).boxed();
        }


    public static void main(String[] args) {
        int[] nums=new int[]{-1,1,0,-3,3};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}


