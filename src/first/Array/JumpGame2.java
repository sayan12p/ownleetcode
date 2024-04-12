package first.Array;

public class JumpGame2 {

    public static int jump(int[] nums){
       int count=0;
       int n=nums.length;
       int start=0;
       int farthest=0;
       if(n==1) return 0;
       for(int  i=0;i<n-1;i++){
           farthest=Math.max(farthest,i+nums[i]);
           if(i==start){
               start=farthest;
               count++;
           }
        }
       return count;
    }
    public static void main(String[] args) {
        int[] nums=new int[]{1,1,3,4};
        System.out.println(jump(nums));
    }
}
