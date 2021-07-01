package BinarySearch;

public class FindMinInRotatedArray2 {
    public static int findMin(int[] nums) {
    int low=0;int high=nums.length-1;
    while(low<high){
            int mid=low+(high-low)/2 ;
            if(nums[mid]<nums[high]){
                high=mid;
            }else if(nums[mid]>nums[high]){
                low=mid+1;
            }
            else high-=1;
    }
    return nums[low];
    }
    public static void main(String[] args) {
      int[] nums={0,4,4,4,5,6,7};
        System.out.println(findMin(nums));
    }

}
