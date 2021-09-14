package first.Array;

import java.util.Arrays;

public class LongestAlternateSubsequence {
    public static int AlternatingaMaxLength(int[] nums)
    {
        int n=nums.length; int result=Integer.MIN_VALUE;
        int ma=1,mi=1;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                ma=mi+1;
            }
            else if (nums[i]<nums[i+1]){
                mi=ma+1;
            }
            result=Math.max(result,Math.max(ma,mi));
        }
        return result;
    }
    public static void main(String[] args) {
        int[] A=new int[]{1,17,5,10,13,15,10,5,16,8};
        System.out.println(AlternatingaMaxLength(A));
    }
}
