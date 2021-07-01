package TwoPointers;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MergeTwoSortedLists {
    public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
        int i;
        int asize=a.size();
        int j=b.size()-1;

        for(i=0;i<asize;i++){
        for(;j>=0;j--){
           a.add(b.get(j));
        }
        }
        Collections.sort(a);
        System.out.println(a);
    }

    public static void main(String[] args) {
    ArrayList<Integer> a=new ArrayList<>();
    a.add(1);
    a.add(3);
    a.add(5);
    ArrayList<Integer> b=new ArrayList<>();
    b.add(8);
    b.add(9);
    merge(a,b);
    }
}
