package first.Array;

import java.util.Arrays;
import java.util.List;

public class MinimumSizeSubarraySum {
    public static int[] minSubArrayLen(int target, int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int sum=0;
        int j=0;
        int firstindex=0;
        int lastindex=1;
        int n=nums.length;int minlen=n+1;
        while(j<n){
            sum+=nums[j];
            while(sum>=target){
                int len=j-i+1;
                firstindex=i;
                lastindex=j;
                minlen=Math.min(len,minlen);
                sum-=nums[i];
                i++;
            }
            j++;
        }
        return new int[]{firstindex,lastindex};
    }
    public static void main(String[] args) {
        int[] nums=new int[]{2,3,1,2,4,3};
        System.out.println(Arrays.toString(minSubArrayLen(7,nums)));
    }
}
