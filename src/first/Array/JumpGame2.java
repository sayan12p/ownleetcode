package first.Array;

public class JumpGame2 {

    public static int jump(int nums[]){
        int pos=0;
        int des=0;
        int jump=0;
        for(int i=0;i<nums.length-1;i++){
            des=Math.max(des,i+nums[i]);
            if(pos==i){
                pos=des;
                jump++;
            }
        }
        return jump;
    }
    public static void main(String args[]){
        int nums[]={2,3,1,1,4};
        System.out.println(jump(nums));
    }
}
