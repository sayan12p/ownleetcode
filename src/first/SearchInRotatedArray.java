package first;

import java.util.Arrays;

public class SearchInRotatedArray {
    public static int search(int[] nums, int target) {

        //Arrays.sort(nums);
        for(int i:nums){
            if(nums[i]==target)
                return i;
            else return -1;
        }
        return 0;
    }
    public static void main(String args[]){
        int[] nums={4,5,6,7,0,1,2};
       int result= search(nums,3);
        System.out.println(result);

    }
}
