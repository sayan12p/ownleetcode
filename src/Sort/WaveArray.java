package Sort;

import java.util.Arrays;

public class WaveArray {
    public static void convertToWave(int arr[], int n){
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i%2==0 && (i+1)!=n) {
                swap(arr,i, i + 1);
            }

        }
    }
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void main(String[] args) {
    int[] array=new int[]{1,2,3,4,5};
    convertToWave(array,5);
        System.out.println(Arrays.toString(array));
    }
}
