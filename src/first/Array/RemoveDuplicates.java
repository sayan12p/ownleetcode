package first.Array;


import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static Integer[] removeDuplicates(Integer[] nums) {
       int n=nums.length;int j=0; int counter=0;
       for(int i=0;i<n-1;i++){
          if(nums[i]!=nums[i+1]){
              nums[j++]=nums[i];
              counter++;
          }
       }
       nums[j]=nums[n-1];
       for(int i=counter+1;i<nums.length;i++){
            nums[i]= null;
       }
       return nums;
    }
public static  void main(String args[]){

    Integer array[]=new Integer[]{1,1,2,2,3,3,4,4,5,5};

    Integer[] result=removeDuplicates(array);
    System.out.println(Arrays.toString(result));
}
}
