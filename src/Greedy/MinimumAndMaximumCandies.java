package Greedy;

import java.util.Arrays;

public class MinimumAndMaximumCandies {
    public static void findMaximum(int arr[], int n, int k){
        Arrays.sort(arr);
        int minprice = arr[n - 1-k] + arr[n - 2-k];
        int maxprice = arr[0+k] + arr[1+k];

        System.out.println(maxprice);
        System.out.println(minprice);
    }
    public static void main(String[] args) {
        int[] price=new int[]{3, 2, 1, 4};
       int k=2;
        findMaximum(price,4,2);
    }
}
