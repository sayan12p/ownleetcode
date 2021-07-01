package geeksforgeeks.Sorting;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int arr[], int low, int high)
    {
    if(low<high){
        int p=partition(arr,low,high);
        quickSort(arr,low,p-1);
        quickSort(arr,p+1,high);
    }
    }
    static int partition(int arr[], int low, int high)
    {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public static void main(String[] args) {
        int arr[]={ 2, 1, 6, 10, 4, 1, 3, 9, 7};
        quickSort(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }
}
