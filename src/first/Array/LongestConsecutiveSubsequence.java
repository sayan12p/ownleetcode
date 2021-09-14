package first.Array;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static int findLongestConseqSubseq(int arr[], int N)
    {
        Arrays.sort(arr);
        int i=0;int j=i+1;
        int l=N-1;
        while(i<=l && j<=l){
           while(arr[j]-arr[i]==1){
               i++;
               j++;
           }
            return j;
        }
    return 0;
    }
    public static void main(String[] args) {
      int arr[]=new int[]  {1,9,3,10,4,20,2};
        System.out.println(findLongestConseqSubseq(arr,7));
    }
}
