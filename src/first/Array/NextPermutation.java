package first.Array;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        if(nums==null || nums.length<1) return;
        int i=nums.length-2;
        while (i>=0 && nums[i]>=nums[i+1]) i--;
        if (i>=0){
            int j=nums.length-1;
            if(nums[j]<=nums[i]) j--;
            swap(nums,i,j);

        }

        reverse(nums,i+1,nums.length-1);


    }
    public static void swap(int[] a,int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void reverse(int [] a,int i,int j){
        while(i>j) swap(a,i++,j--);
    }
    public static void main(String args[]){
        int nums[]={1,3,5,4,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
