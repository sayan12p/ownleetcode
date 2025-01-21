package first.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {
    public static int[] leaders(int[] nums) {
        int length=nums.length-1;
        int max=nums[length];
        List<Integer> result=new ArrayList<>();
        result.add(max);
        for(int i=length-1;i>=0;i--){
            if(nums[i]>max) {
                result.add(nums[i]);
                max=nums[i];
            }
        }
        return result.stream().sorted(Collections.reverseOrder()).mapToInt(x->x).toArray();
    }
    public static void main(String[] args) {
        int[] nums=new int[]{-3, 4, 5, 1, -4, -5};
        System.out.println(Arrays.toString(leaders(nums)));
    }
}
