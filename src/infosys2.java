import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class infosys2 {
    public static int[] sumArr(int arr[], int n)
    {
        // TERMINATING CONDITION.
        // if we are first element, don't do anything
        if(n<=1){ return null; }
        // Add all prev elements for first n-1 elements
        sumArr(arr, n-1);
        // With problem solved till (n-1),
        // we just need to add (n-1)th element to n'th element
        arr[n-1] += arr[n-2];
        System.out.println("hello");
        return arr;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumArr(new int[]{7, 3, 4,6,9},5)));

    }
}