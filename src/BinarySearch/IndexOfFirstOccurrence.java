package BinarySearch;

public class IndexOfFirstOccurrence {
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



    public static void main(String[] args) {
        int[] a = {8,10, 12, 13, 15,15, 15, 20};
        System.out.println(search(a, 0, 7, 15));

    }
}
