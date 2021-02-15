package first;

public class AreaContainer {
//leetcode array
    public static int maxArea(int[] height){

        int maxArea=0;
        for(int i=0;i<height.length;i++){
            for (int j=i+1;j<height.length;j++){
                maxArea=Math.max(maxArea,Math.min(height[i],height[j])*(j-i));
            }
        }
        return maxArea;
    }
    public static void main(String args[]){
        int[] height=new int[]{1,8,6,2,5,4,8,3,7};
        int result=maxArea(height);
        System.out.println(result);
    }
}
