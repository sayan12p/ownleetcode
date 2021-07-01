package Sort;

import java.util.ArrayList;

public class MergeSort {
    public static void mergesort(int[] array1,int[] array2){
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<array1.length && j<array2.length){
            if(array1[i]<=array2[j]){
                    list.add(array1[i]);
                    i++;
                }else if(array1[i]>array2[j]){
                list.add(array2[j]);
                j++;
            }
            if(i==array1.length){
                    for(;j<array2.length;j++)
                    list.add(array2[j]);
            }
            if(j==array2.length){
                for(;i<array1.length;i++){
                    list.add(array1[i]);
                }
            }
            }
        System.out.println(list.toString());
        }


    public static void main(String[] args) {
        int[] array1=new int[]{10,20,35,40,60,100,120,140};
        int[] array2=new int[]{5,30,35,50,50,65,80,90,100,110,130};
        mergesort(array1,array2);
    }
}
