package first;

import java.util.ArrayList;
import java.util.List;

public class MinSubArraySumLength {
    public static int minSubArrayLen(int target, int[] nums) {

        /*List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
                return list.size();
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int max = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] + max >= target) {
                    if (j != i + 1) continue;
                    list.add(i);
                    list.add(j);
                    return list.size();

                }
            }
        }
        return 0;*/
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            while (sum >= target) {
                ans = Math.min(ans, i + 1 - left);
                sum -= nums[left++];
            }
        }
        return (ans != Integer.MAX_VALUE) ? ans : 0;
    }
    public static void main(String[] args) {
        int nums[]={2,3,1,2,4,3};
        int target=7;
        System.out.println(minSubArrayLen(target,nums));
    }
}
