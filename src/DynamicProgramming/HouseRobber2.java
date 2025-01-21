package DynamicProgramming;

import java.util.Arrays;

public class HouseRobber2 {

    static int func(int[] nums,int index,int[] dp) {
        if (index==0) return nums[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int pick=nums[index]+func(nums,index-2,dp);
        int notpick=0+func(nums,index-1,dp);
        return dp[index]=Math.max(pick,notpick);
    }

    static int maxnonadjacentsum(int[] nums){
            int n= nums.length;
            int[] dp=new int[n];
        Arrays.fill(dp,-1);
            return func(nums,n-1,dp);

        }

    public static int rob(int[] nums) {
        //You can code here
        int length=nums.length;
        if(length==1) return nums[0];
        int[] pick=new int[length-1];
        int j=0;
        int[] notpick=new int[length-1];
        for(int i=1;i<=length-1;i++){
            pick[j++]=nums[i];
        }
        j=0;
        for(int i=0;i<length-1;i++){
            notpick[j++]=nums[i];
        }
       return Math.max(maxnonadjacentsum(pick),maxnonadjacentsum(notpick));
    }
    public static void main(String[] args) {
        int[] nums={1, 2, 3};
        System.out.println(rob(nums));
    }
}
