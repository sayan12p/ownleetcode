package first.Array;

import java.util.Arrays;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
       /* if(nums.length>2){
            Arrays.sort(nums);
        }*/
        int first_num=Integer.MAX_VALUE;
        int second_num=Integer.MAX_VALUE;
        for(int n:nums){
            if(n<first_num){
                first_num=n;//to find the first smallest number
            }
            else if(n<=second_num){
                second_num=n;// to find the second smallest number
            }
            else return true;// we have found the third ssmallest number hence return true
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{5,1,5,5,2,5,4};
        System.out.println(increasingTriplet(nums));
    }
}
