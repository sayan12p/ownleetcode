package first.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ChocolateDistributionProblem {
    public static int findMinDiff (int[]a, int n, int m)
    {
        // your code here
        if (n < m)
            return -1;
       Arrays.sort(a);
        int d=Integer.MAX_VALUE;
        for(int i=0;i+m-1<n;i++){
            int diff=a[i+m-1]-a[i];
            if(diff<d){
                d=diff;
            }
        }
    return d;
    }
    public static void main(String[] args) {
        int[] a=new int[]{3, 4, 1, 9, 56, 7, 9, 12};
        System.out.println(findMinDiff(a,8,5));


    }
}
