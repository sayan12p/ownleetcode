package first.Array;

public class MaximumAlternatingSubsequenceSum {
    public static  long maxAlternatingSum(int[] nums) {
        int odd=0; int even =0;
        for(int i=0;i<nums.length;i++){
            int neweven=Math.max(even, odd+nums[i]);
            int newodd=Math.max(odd,even- nums[i]);
            even=neweven;
            odd=newodd;
        }
        return Math.max(odd,even);
    }
    public static void main(String[] args) {
        int[] nums=new int[]{4,2,5,3};
        System.out.println(maxAlternatingSum(nums));
    }
}
