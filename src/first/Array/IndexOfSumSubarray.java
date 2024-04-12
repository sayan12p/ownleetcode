package first.Array;

import java.util.Arrays;

public class IndexOfSumSubarray {


    public static int[] get(int[] nums,int target){
        int sum=nums[0];
        int i=0;
        int j=1;
        while(j<nums.length){
            sum+=nums[j];
            while (sum>=target){
                sum-=nums[i];
                i++;
                if(sum==target) return new int[]{i,j};
            }
            j++;
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,4,6,5,6,9};
        System.out.println(Arrays.toString(get(nums,17)));
    }
}
