package first.Array;

import java.net.Inet4Address;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumClosest {
    public static int threeSumClosest(int[] nums, int target) {
        Set<List<Integer>> result=new HashSet<>();
        int sum=0;
        int diff= Integer.MAX_VALUE;
        if(nums.length>2){
            Arrays.sort(nums);
        }
        for(int i=0;i<nums.length-2 && diff!=0;i++){
            int low=i+1;
            int high=nums.length-1;

            while (low<high){
                sum=nums[i]+nums[low]+nums[high];
                if(Math.abs(target-sum)<Math.abs(diff)){
                    diff=target-sum;
                }
                if(sum<target){
                    low++;
                }
                if(sum>target){
                    high--;
                }

            }
        }
        return sum;
    }

    public static void main(String[] args) {
    int[] nums={-1,2,1,-4};
    int target=8;
        System.out.println(threeSumClosest(nums,target));
    }
}
