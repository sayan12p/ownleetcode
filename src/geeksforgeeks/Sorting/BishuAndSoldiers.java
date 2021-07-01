package geeksforgeeks.Sorting;

import java.util.Arrays;

public class BishuAndSoldiers {
    public static int returna(int[] powerofsoldiers,int[] powerofbishu){
        Arrays.sort(powerofsoldiers);
    int low=0;
    int n=0;
    int high=powerofsoldiers.length-1;
        for(int i=0;i<powerofbishu.length;i++){
    while(low<=high) {
        int mid = low + (high - low) / 2;

            if(powerofbishu[0]>powerofsoldiers[mid]){
                n+=mid-low+1;
                low=mid+1;

            }
            else if(powerofbishu[0]<powerofsoldiers[mid]){
                high=mid-1;

            }
            else if(powerofbishu[0]==powerofsoldiers[mid]){
                n=mid+1;
                low=mid+1;
            }
        }
        low=0;high=powerofsoldiers.length-1;
    }
    return n;
    }
    public static int calculatepower(int[]powerofsoldiers,int n){
        int result=0;
        for(int i=0;i<n;i++){
            result+=powerofsoldiers[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int noofsoldiers=7;
        int[] powerofsoldiers=new int[noofsoldiers];
        powerofsoldiers[0]=1;
        powerofsoldiers[1]=2;
        powerofsoldiers[2]=3;
        powerofsoldiers[3]=4;
        powerofsoldiers[4]=5;
        powerofsoldiers[5]=6;
        powerofsoldiers[6]=7;
        int[]powerofbishu=new int[]{2};
        int result = returna(powerofsoldiers, powerofbishu);
        calculatepower(powerofsoldiers,7);
    }
}
