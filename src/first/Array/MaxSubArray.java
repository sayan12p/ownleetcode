package first.Array;

public class MaxSubArray {
    public static int maxSubArray(int[] nums) {

        int sum=nums[0];
        int max=nums[0];

        if(nums.length==1) return max;

        for(int i=1;i<nums.length;i++){
            if(sum+nums[i]<nums[i]){
                sum=nums[i];
            }else{
                sum=sum+nums[i];
            }
            max=Math.max(sum,max);
        }
        return max;
    }
    public static void main(String args[]){
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int result=maxSubArray(nums);
        System.out.println(result);
    }
}
