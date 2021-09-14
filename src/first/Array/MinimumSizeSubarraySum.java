package first.Array;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        int l=0;
        int sum=0;
        int r=nums.length-1;
        while(l<r){
           sum=nums[l]+nums[r];
           if(sum<target){
               l++;
           }
           else if(sum>target){
               r--;
           }
           else return (r-l);
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,1,2,4,3};
        System.out.println(minSubArrayLen(7,nums));
    }
}
