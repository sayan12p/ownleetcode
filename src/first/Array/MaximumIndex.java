package first.Array;

import java.util.*;
import java.util.stream.Collectors;

public class MaximumIndex {
    public static int maxIndexDiff(int arr[], int n) {

        // Your code here
        int maxDiff = -1;
        int i, j;

        for (i = 0; i < n; ++i) {
            for (j = n - 1; j > i; --j) {
                if (arr[j] > arr[i] && maxDiff < (j - i))
                    maxDiff = j - i;
            }
        }

        return maxDiff;
    }
    public static void main(String[] args) {
    int[] nums={34, 8, 10, 3, 2, 80, 30, 7, 1};
        System.out.println(maxIndexDiff(nums,8));
    }
}
