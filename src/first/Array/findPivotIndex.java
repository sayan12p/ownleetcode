package first.Array;

public class findPivotIndex {

    public static int pivotIndex(int[] nums) {
        int totalsum=0; int leftsum=0;
        for(int i=0;i<nums.length;i++){
            totalsum+=nums[i];
        }
        for(int i=0;i<nums.length;leftsum+=nums[i++]){
            if(leftsum*2==totalsum-nums[i]){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a=new int[]{1,7,3,6,5,6};
        System.out.println(pivotIndex(a));
    }

}
