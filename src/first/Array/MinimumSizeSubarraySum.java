package first.Array;

import java.util.Arrays;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int sum=0;
        int j=0;
        int n=nums.length;int minlen=n+1;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                int len=j-i+1;
                minlen=Math.min(len,minlen);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return minlen;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5};
        System.out.println(minSubArrayLen(11,nums));
    }
}
