package Greedy;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Maximum69Number {
    public static String[] maximum69Number (int num) {

        int length=Integer.toString(num).length();
        int fi=0;
        int[] nums=new int[length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==6)
            nums[i]=Math.max(6,nums[i]);
            else nums[i]=Math.max(9,nums[i]);
        }
        IntStream stream=Arrays.stream(nums);
         String result[]=stream.boxed().map(integer -> Integer.toString(integer)).toArray(String[]::new);

        return result;

    }
    public static void main(String[] args) {
    int num=9996;
        System.out.println(maximum69Number(num));
    }
}
