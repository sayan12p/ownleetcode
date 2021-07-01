package BinarySearch;

public class Books {
    //maximum number of pages allocated to a student is minimum
    public static int books(int[] A, int B) {
        int min=0;
         int low=getMax(A);
        int high=getSum(A);
        while(low<=high){
            int mid=low+(high-low)/2;
            int studentcount=getStudentcount(A,A.length,mid);
            if(studentcount>B){
                low=mid+1;
            }
            else {
                min=mid;
                high=mid-1;
            }
        }
        return min;

    }

    private static int getSum(int[] a) {
        int sum=0;
        for(int val:a){
            sum+=val;
        }
        return sum;
    }

    private static int getMax(int[] a) {
        int max=Integer.MIN_VALUE;
        for(int val:a){
            max=Math.max(max,val);
        }
        return max;
    }
    ///to find how many students can be allocated mid pages
    private static int getStudentcount(int[] a, int length, int mid) {
        int total = 0, numberofstudent = 1;
        for (int i = 0; i < length; i++) {
            total += a[i];
            if (total > mid) {
                total = a[i];
                numberofstudent++;
            }

        }
        return numberofstudent;
    }


    public static void main(String[] args) {
        int A[]={12,34,67,90};
        System.out.println(books(A,2));
    }
}
