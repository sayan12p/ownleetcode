package Sort;

public class CountInversionInArray {
    public static int reversePairs(int[] nums) {
        return mergesort_and_count(nums, 0, nums.length - 1);
    }

    private static int mergesort_and_count(int[] nums, int start, int end) {
        if(start<end){
            int mid=(start+end)/2;
            int count=mergesort_and_count(nums,start,mid)+mergesort_and_count(nums,mid+1,end);
            int j=mid+1;
            for(int i=start;i<=mid;i++) {
                while (j <= end && nums[i] > nums[j] && i<j) {
                    j++;
                }
                count += j - (mid + 1);
            }
            ReverseArray.merge(nums,start,mid,end);
            return count;
        }
        else return 0;

    }


    public static void main(String[] args) {
        int nums[]={3, 1, 2};
        System.out.println(reversePairs(nums));
    }
}
