package first.Array;

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[pos]= nums[i];
                pos++;
            }
        }
        for(;pos<nums.length; pos++){
            nums[pos] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }



    public static void main(String[] args) {
    int[] nums={0,1,0,3,12};
    moveZeroes(nums);
    }
}
