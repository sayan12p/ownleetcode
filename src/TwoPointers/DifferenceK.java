package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;

public class DifferenceK {
    public static int diffPossible(ArrayList<Integer> A, int B) {
       Integer[] a=A.toArray(new Integer[A.size()]);
        Arrays.sort(a);
       int i=0,j=1;
       while(i<a.length && j<a.length ) {
           if (Math.abs(a[i] - a[j]) == B && i != j) {
               return 1;
           }
           else if(Math.abs(a[i]-a[j])<B){
               j++;
           }
           i++;
}
       return 0;
    }
    public static void main(String[] args) {
       ArrayList<Integer>a= new ArrayList<>();
       a.add(1);
       a.add(2);
       a.add(2);
        a.add(3);
        a.add(4);
        System.out.println(diffPossible(a,0));
    }
}
