package first.Array;

import java.util.Arrays;

public class SumPair {
    public static int[] sumClosest(int[] arr,int n, int x) {
        // code here
        int res_l=0, res_r=0;  // To store indexes of result pair

        // Initialize left and right indexes and difference between
        // pair sum and x
        int l = 0, r = n-1, diff = Integer.MAX_VALUE;

        // While there are elements between l and r
        while (r > l)
        {
            // Check if this pair is closer than the closest pair so far
            if (Math.abs(arr[l] + arr[r] - x) < diff)
            {
                res_l = l;
                res_r = r;
                diff = Math.abs(arr[l] + arr[r] - x);
            }

            // If this pair has more sum, move to smaller values.
            if (arr[l] + arr[r] > x)
                r--;
            else // Move to larger values
                l++;
        }
        return new int[]{arr[res_l],arr[res_r]};
    }
    public static void main(String[] args) {
       int  arr[] = {12, 22, 28, 29, 30, 40};
        System.out.println(Arrays.toString(sumClosest(arr,6,42)));
    }
}
