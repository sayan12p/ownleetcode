package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxNoOf1s {
    public static void maxone(ArrayList<Integer> A, int B) {
        Integer[] a=A.toArray(new Integer[A.size()]);
        ArrayList<Integer> result=new ArrayList<>();
        int j=0; int x=0;int length; int ans=0;
        int count=0;
        for(int i=0;i<a.length;i++){
        if(a[i]==0) count++;
        while(count>B){
            j=i-1;
            length=countLength(x,j);
            if(length>ans){
                ans=length;
                for(;x<=j;x++)
                    result.add(x);
        }x=i;
            j=0;
            count=0;
        }

        }
        System.out.println(result.toString());
    }

    private static int countLength(int x,int y) {
        return y-x+1;
    }

    public static void main(String[] args) {
    maxone(new ArrayList<>(Arrays.asList(1 ,1, 0, 1, 1, 0, 0, 1, 1, 1)),1);
    }
}
