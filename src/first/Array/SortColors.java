package first.Array;

import java.util.Arrays;

public class SortColors {
    public static void sortcolors(int[] nums){
        //l=left ball pointer(0)
        //i=midddle ball pointer(1)
        //r=right ball pointer(2)
        int l=0,i=0,r=nums.length-1;
        while(i<=r){
            if(nums[i]==0){
                swap(nums,i++,l++);

            }
            else if(nums[i]==2){
                swap(nums,i,r--);
            }
            else i++;
        }
    }
    public static void swap(int[] nums,int p1,int p2){
        int swap=nums[p1];
        nums[p1]=nums[p2];
        nums[p2]=swap;
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        sortcolors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
