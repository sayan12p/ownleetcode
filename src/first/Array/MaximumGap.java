package first.Array;

import java.util.Arrays;

public class MaximumGap {

    public static int maximumGap(int[] nums) {
        Arrays.sort(nums);
        int maxdiff=0;
        for(int i=1;i<nums.length;i++){
            int diff=nums[i]-nums[i-1];
            maxdiff=Math.max(diff,maxdiff);
        }
        return maxdiff;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{3,6,9,1};
        System.out.println(maximumGap(nums));
    }
}
