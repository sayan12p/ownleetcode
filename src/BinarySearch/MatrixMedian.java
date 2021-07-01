package BinarySearch;

import java.util.Arrays;

public class MatrixMedian {

    public int findMedian(int[][] A){
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<A.length;i++){
            max=Math.max(max,A[i][A[i].length-1]);
            min=Math.min(min,A[i][0]);
        }
        int median=(1+A.length*A[0].length)/2;
        while(min<max){
            int total_count=0;
            int mid=min+(max-min)/2;
            for(int i=0;i<A.length;i++){
                int index = Arrays.binarySearch(A[i],mid);
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
