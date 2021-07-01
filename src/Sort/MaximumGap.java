package Sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MaximumGap {
    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        for(int i=0;i<nums.length-1;i++){
               int  diff=nums[i+1]-nums[i];
                result=diff;
                result = Math.max(result,diff);
            }

        return result;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,3,6,9};
        System.out.println(maximumGap(nums));
    }
}
