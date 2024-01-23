package first.Array;


import java.util.*;
import java.util.stream.Collectors;

public class FindMissingAndRepeating {
    public static void findTwoElement(int arr[], int n) {
        // code here
        List<int[]> array=new ArrayList<>(Arrays.asList(arr));
        Set<Integer> allItems=new HashSet<>();
        List<Integer> duplicates = array.stream().flatMap(p -> Arrays.stream(p).boxed()).filter(i -> !allItems.add(i)).collect(Collectors.toList());
        Set<Integer> allItemswithoutduplicates=array.stream().flatMap(p -> Arrays.stream(p).boxed()).collect(Collectors.toSet());
        for (int i = 0; i < n-1; i++) {
            if (arr[Math.abs(arr[i]) - 1] > 0)
                arr[Math.abs(arr[i]) - 1] = -arr[Math.abs(arr[i]) - 1];
        }
        for(int i=0;i<n-1;i++){
            if(arr[i]>0){
                System.out.println(i+1);
            }
        }
       System.out.println(duplicates);
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 3};
       findTwoElement(arr,3);
    }
}
