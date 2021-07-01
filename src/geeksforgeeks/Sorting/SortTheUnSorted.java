package geeksforgeeks.Sorting;

import java.util.Arrays;

public class SortTheUnSorted {
    public static void sortHalves (int arr[], int n)
    {
        //insertion sort
        int left=0, right=n-1;
        for (int i = left, j = i; i < right; j = ++i) {
            int ai = arr[i + 1];
            while (ai < arr[j]) {
                arr[j + 1] = arr[j];
                if (j-- == left) {
                    break;
                }
            }
            arr[j + 1] = ai;
        }
    }

    public static void main(String[] args) {
        int[] arr={2,3,8,-1,7,10};
        sortHalves(arr,6);
    }
}
