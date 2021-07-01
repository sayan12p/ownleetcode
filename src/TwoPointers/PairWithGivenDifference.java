package TwoPointers;

public class PairWithGivenDifference {
    public static int solve(int[] A, int B) {
        int size=A.length;
        int j=A.length-1;
        for(int i=0;i<size;i++){
           for(j=A.length-1;j>i;j--){
               if((A[i]+B)==A[j]){
                   return 1;

               }
               else continue;
           }
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(solve(new int[]{20,500,1000,200},0));
    }
}
