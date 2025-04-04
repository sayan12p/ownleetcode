package first.Array;

import java.util.Arrays;

public class LongestConsecutiveSubsequence {
    public static int findLongestConseqSubseq(int arr[], int N)
    {
        Arrays.sort(arr);
        int i=0;int j=i+1;
        int l=N-1;
            if(arr[j]-arr[i]==0){
                i++;
                j++;
            }
           while(i<=l && j<=l && arr[j]-arr[i]==1) {
               i++;
               j++;
           }
            return j;
        }
    public static void main(String[] args) {
      int arr[]=new int[]  {0,3,7,2,5,8,4,6,0,1};
        System.out.println(findLongestConseqSubseq(arr,9));
    }
}
