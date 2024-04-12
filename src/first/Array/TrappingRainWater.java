package first.Array;

public class TrappingRainWater {

    public static int trap(int[] height) {
    int maxheight=height[0];int length=height.length; int sum=0;int maxind=0;
    for(int i=0;i<length;i++){
        if(maxheight<height[i]) {
            maxheight=height[i];
            maxind=i;
        }
    }
    int leftmax=height[0];
    for(int i=0;i<maxind;i++){
        if(leftmax<height[i]) leftmax=height[i];
        sum+=leftmax-height[i];
    }
        int rightmax=height[length-1];
        for(int i=length-2;i>maxind;i--){
            if(rightmax<height[i]) rightmax=height[i];
            sum+=rightmax-height[i];
        }
        return sum;
    }
    public static void main(String[] args) {
    int[] s=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(s));
    }
}
