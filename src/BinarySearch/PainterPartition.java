package BinarySearch;

public class PainterPartition {
    //A--> no of painters
    //B--> time taken by each painter
    //https://www.youtube.com/watch?v=mQ6_UX0hnuc&t=1087s
    public static int paint(int A, int B, int[] C) {
        int low=getMax(C,B);
        int high =getSum(C,B);
        int mintime=0;
        while (low<=high){
            int mid=low+(high-low)/2;
            int painterscount=getPainterscount(C,C.length,mid,B);
            if(painterscount>A){
                low=mid+1;
            }else {
                mintime=mid;
                high=mid-1;
            }
        }
        return mintime;
    }
//to find the time if the same painter paints all the blocks
    private static int getSum(int[] c,int b) {
        int sum=0;
        for(int val:c){
            sum+=val;
        }
        return sum*b;
    }
// to find the lowest time
    private static int getMax(int[] c,int b) {
        int max=Integer.MIN_VALUE;
        for(int val:c){
            max=Math.max(max,val*b);
        }
        return max;
    }

//to find the number of painters if the time is mid
    private static int getPainterscount(int[] c, int length, int mid,int b) {
        int total = 0, numberofpainters = 1;
        for (int i = 0; i < length; i++) {
            total += c[i]*b;
            if (total > mid) {
                total = c[i];
                numberofpainters++;
            }

        }
        return numberofpainters;
    }
    public static void main(String[] args) {
    int[] c={1,10};
    int a=2;
    int b=5;
        System.out.println(paint(a,b,c));
    }
}
