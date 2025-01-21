package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber {

    public static int findMaxSum(int nums[], int n) {
        // You can code here
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return findMaxSumHelper(nums,dp,n-1);
    }

    public static int findMaxSumHelper(int[] nums,int[] dp,int index){
        if(index==0) return nums[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int taken =nums[index]+findMaxSumHelper(nums,dp,index-2);
        int nottaken= 0+ findMaxSumHelper(nums,dp,index-1);
        return dp[index]=Math.max(taken,nottaken);
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,1};
        System.out.println(findMaxSum(nums,4));
    }
}
