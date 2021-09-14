package first.Array;

public class JumpGame {

    public static boolean jump(int nums[]){
return canJump(0,nums);
    }

    private static boolean canJump(int position, int[] nums) {
        if(position==nums.length-1){
            return true;
        }
        int farthestJump=Math.min(position+nums[position],nums.length-1);
        for(int nextposition=position+1;nextposition<=farthestJump;nextposition++){
            if(canJump(nextposition,nums)){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int nums[]={2,1,2,0,4};
        System.out.println(jump(nums));
    }
}
