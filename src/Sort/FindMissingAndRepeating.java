package Sort;

import java.util.Arrays;
import java.util.HashMap;

public class FindMissingAndRepeating {
    public  static int[] findTwoElement(int arr[], int n) {
        // code here
        int a=0,b;
        //a = repeating
        // b==missing
        //mark which ever element we are visiting as negative and if we visit twice then that element becomes the repeating
        //element
        int[] result=new int[2];
        for (int i=0;i<n;i++){
            if((arr[Math.abs(arr[i])-1])<0){
                a=Math.abs(arr[i]);
                result[0]=a;
            }
            else{
                arr[Math.abs(arr[i]-1)]=-arr[Math.abs(arr[i]-1)];
            }
        }
        //to check for missing element
        for(int i=0;i<n;i++) {
            if (arr[i] > 0) {
                b = i + 1;
                result[1] = b;
            }
        }

        return result;
    }

    public static void main(String[] args) {
    int arr[]=new int[]{2,2};
        System.out.println(Arrays.toString(findTwoElement(arr,2)));
    }
}
