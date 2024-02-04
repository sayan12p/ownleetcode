package first.Array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

      k=k%nums.length;
      rotate(nums,0,nums.length-1);
      rotate(nums,0,k-1);
      rotate(nums,k,nums.length-1);
    }

    public static void rotate(int[] nums,int start,int end){
        while(start<=end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }

    public static void main(String[] args) {
       int[] nums=new int[]{ 1,2,3,4,5,6,7};
       rotate(nums,3);
        System.out.println(Arrays.toString(nums));
    }
}
