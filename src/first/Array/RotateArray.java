package first.Array;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {

        int n=nums.length-1;
        for(int i=0;i<n;i++){
            nums[i]=7;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
       int[] nums=new int[]{ 1,2,3,4,5,6,7};
       rotate(nums,3);
    }
}
