package TwoPointers;

import java.util.Arrays;

public class IntersectionSortedArrays {
    public static int[] intersect(final int[] A, final int[] B) {
        int i=0; int a=0;
        int j=0;
        int[] result=new int[Math.max(A.length,B.length)];
        while(i<A.length && j<B.length){
            if(A[i]==B[j] && a<result.length) {
                result[a++] = A[i];
                i++;
                j++;
            }else if(A[i]>B[j]){
                j++;
            }
            else i++;
        }
        return result;
    }
    public static void main(String[] args) {
    int[] a={1, 2, 3, 3, 4, 5, 6};
    int[] b={3,3,5};
        int[] intersect = intersect(a, b);
        for(int i=0;i<intersect.length;i++){
            if(intersect[i]==0) break;
            System.out.print(" "+ intersect[i]);
        }
    }
}
