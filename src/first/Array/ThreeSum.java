package first.Array;

import java.util.*;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> list=new HashSet<>();
        if(nums.length>2){
            Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            int l = i + 1, r = nums.length - 1, sum;
            while (l < r) {
                sum = nums[i] + nums[l] + nums[r];
                if (sum == 0)
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));

                if (sum < 0)
                    l++;
                else
                    r--;
            }
        }
        return new ArrayList<>(list);
        }
        else return new ArrayList<>(list);
    }
    public static void main(String args[]){
        int[] nums =new int[]{-1,0,1,2,-1,-4};
        List<List<Integer>> result=threeSum(nums);
        System.out.println(Arrays.asList(result).toString());

    }
}
