package TwoPointers;

import java.util.*;

public class ThreeSum {
    public static ArrayList threeSum(int[] A) {
        ArrayList <ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(A);
        for(int i=0;i<A.length;i++){
            int a=i+1;
            int j=A.length-1;
        while(a<j) {

            int sum = A[i] + A[a] + A[j];
            if (sum == 0) {
                    ArrayList<Integer> list=new ArrayList<>();
                list.add(A[i]);
                list.add(A[a]);
                list.add(A[j]);
                   if(!result.contains(list)) result.add(list);
                a++;
                j--;
            } else if (sum > 0) {
                j--;
            } else if (sum < 0) {
                a++;
            }
        }
        }

       return result;
    }
    public static void main(String[] args) {
    int[] A={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(A));
    }
}
