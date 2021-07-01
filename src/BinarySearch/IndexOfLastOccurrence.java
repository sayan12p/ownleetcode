package BinarySearch;

public class IndexOfLastOccurrence {
    public static int search(int[] a, int low, int high, int x) {
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(a[mid]>x){
            return search(a,low,mid-1,x);
        }
        else if(a[mid]<x){
            return search(a,mid+1,high,x);
        }
        else{
            if(a[mid]==0|| a[mid]!=a[mid+1]){
                return mid;
            }
            else{
                return search(a,mid+1,high,x);
            }
        }
    }
    public static void main(String[] args) {
        int[] a = {8,10, 10, 10, 10,15, 15, 20};
        System.out.println(search(a,0,7,10));
    }
}
