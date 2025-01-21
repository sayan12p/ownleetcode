package DynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;

public class SubsetProblem1 {

    static HashSet<Integer> subsetSums(ArrayList<Integer> arr, int n) {
        // code here
        HashSet<Integer> subsetsum=new HashSet<>();
        subsetSumHelper(0,0,arr,n,subsetsum);
        return subsetsum;
    }

    private static void subsetSumHelper(int index, int sum, ArrayList<Integer> arr, int n, HashSet<Integer> subsetsum) {
        if(index==n){
            subsetsum.add(sum);
            return;
        }
        subsetSumHelper(index+1,sum+arr.get(index),arr,n,subsetsum);
        subsetSumHelper(index+1,sum,arr,n,subsetsum);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(2);
        list.add(5);
        System.out.println(subsetSums(list,3));
    }
}
