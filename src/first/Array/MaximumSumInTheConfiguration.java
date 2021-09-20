package first.Array;


public class MaximumSumInTheConfiguration {
    public static int max_sum(int A[], int n)
    {
        // Your code here

        int sum=0;
        int pivot=getpivot(A,n);
        int diff=n-1-pivot;
        for(int i=0;i<n;i++){
            sum=sum+((i+diff)%n)*A[i];
        }
        return sum;

    }

    private static int getpivot(int[] a, int n) {
        for(int i=0;i<n;i++){
            if(a[i]>a[(i+1)%n]){
            return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int A[]=new int[]{3,7,1,2};
        System.out.println(max_sum(A,4));
    }
}
