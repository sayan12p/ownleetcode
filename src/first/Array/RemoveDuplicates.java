package first.Array;


import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return null;
        int i = 0;/*int[] temp = new int[nums.length];*/
        int n=nums.length;
        for(i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {

                    nums[j] = nums[n - 1];
                    n--;
                    j--;

                }

            }
        }
        /*temp[i++]=nums[n-1];
        for(int a=0;a<i;a++)
            nums[i]=temp[i];*/
        int result[]=Arrays.copyOf(nums,n);
        return  result;
    }
public static  void main(String args[]){

    int array[]=new int[]{1,1,2,2,3,3,4,4,5,6,7,9,0};

    int[] result=removeDuplicates(array);
    System.out.println(Arrays.toString(result));
}
}
