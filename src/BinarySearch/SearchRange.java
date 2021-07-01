package BinarySearch;

import java.util.Arrays;

public class SearchRange {
    public static int[] searchRange(final int[] A, int B) {
            int first =search(A,0,7,B); int second=0;
            if(first==-1) return null;
            else {
                second=searchlast(A,0,7,B);
            }
            return new int[]{first,second};
        }
    public static int search(int[] a, int low, int high, int x) {
        if (low > high) return -1;
            int mid = low + (high - low) / 2;
//recurrsive solution
            if (a[mid] > x) {
                return search(a, low, mid - 1, x);
            } else if (a[mid] < x) {
                return search(a, mid + 1, high, x);
        } else {
            if (a[mid] == 0 || a[mid-1] != a[mid]) {
                return mid;
            }
            return search(a, low, mid - 1, x);
        }
    }
    public static int searchlast(int[] a, int low, int high, int x) {
        if(low>high) return -1;
        int mid=low+(high-low)/2;
        if(a[mid]>x){
            return searchlast(a,low,mid-1,x);
        }
        else if(a[mid]<x){
            return searchlast(a,mid+1,high,x);
        }
        else{
            if(a[mid]==0|| a[mid]!=a[mid+1]){
                return mid;
            }
            else{
                return searchlast(a,mid+1,high,x);
            }
        }
    }
    public static void main(String[] args) {
    int[] a={10,11,12,13,13,13,13,14};
        System.out.println(Arrays.toString(searchRange(a,13)));
    }
}
