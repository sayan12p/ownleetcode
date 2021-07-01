package BinarySearch;

public class Squareroot {
    //using binarysearch
    public static int sqrt(int A) {
        long low=1, high=A, res=0;
        while(low<=high){
            long mid=low+(high-low)/2;
            if(mid*mid<A){
                res=mid;
                low=mid+1;
            }else if(mid*mid>A){
                high=mid-1;
            }
            else return (int)mid;
    }
    return (int) res;

}
    public static void main(String[] args) {
        System.out.println(sqrt(36));
    }
}
