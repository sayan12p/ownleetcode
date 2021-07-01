package first.Array;

public class MaximumProductSubarray {
    public static int findProductSubarray(int[] nums){
        int result=nums[0];
        for(int i=0;i<nums.length;i++){
            int max=nums[i];
            for(int j=i+1;j<nums.length;j++){
                result=Math.max(max,result);
                max=max*nums[j];
            }
            result=Math.max(max,result);
        }

        return result;
    }
    public static void main(String[] args) {
        int nums[]={2,3,-2,4};
        System.out.println(findProductSubarray(nums));
    }
}
