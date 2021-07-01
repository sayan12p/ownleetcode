package first.LinkedList;

import java.util.Arrays;
import java.util.Scanner;

public class LeftRotate {
    public static int[] rotate(int[] array,int d){
       int [] result=new int[array.length];
       int n=array.length;
        /*int i=0;
        for(;d<array.length;i++){
            result[i]=array[d];
            d++;
        }
        int rotatingPoint=0;
        while(rotatingPoint<d-1){
            result[i]=array[rotatingPoint];
            i++;
            rotatingPoint++;
        }*/
       for(int oldIndex=0;oldIndex<n;oldIndex++){
           int newIndex=(oldIndex+n-d-1)%n;
           result[newIndex]=array[oldIndex];
       }
        return result;
    }
    public static void main(String args[]){
        int array[]=new int[]{1,2,3,4,5,6,7};
        int d=3;

        int []result =rotate(array,d);
        System.out.println(Arrays.toString(result));
    }
}
