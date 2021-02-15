package first;

public class MinimumInRotatedArray {
    public static int findMin(int[] nums) {
        int length = nums.length;
        int left = 0, right = length - 1;
        int min = nums[0];
        if (nums[right] > nums[0])
            return nums[0];
        while (right >= left) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1])
                min = nums[mid + 1];

            if (nums[mid] > nums[0]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return min;
    }


    public static void main(String[] args) {
    int nums[]={4,5,6,7,0,1,2};
        System.out.println(findMin(nums));

    }
}
