package BinarySearch;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinimumSwapstoSort {
    //https://www.youtube.com/watch?v=1BxbBgNSwHo
    public static int minSwaps(int nums[])
    {
     int n=nums.length;int count=0;
        ArrayList<Pair<Integer,Integer>> numsort=new ArrayList<>();
        for(int i=0;i<n;i++){
            numsort.add(new Pair<Integer, Integer>(nums[i],i));
        }
        ArrayList<Pair<Integer,Integer>> numsoriginal=numsort;
        numsort.sort(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                if(o1.getKey().equals(o2.getKey())) return 0;
                else if(o1.getKey()>o2.getKey()) return 1;
                else return -1;
            }
        });
        for(int i=0;i<numsort.size();i++) {
            //System.out.println(numsort.get(i).getValue());
            if (i == numsort.get(i).getValue()) {
                continue;
            } else {
                count++;
                Collections.swap(numsort,i, numsort.get(i).getValue());
                i--;
            }
        }
        return count;
    }



    public static void main(String[] args) {
      int[] nums=  {7,16,14,17,6,9,5,3,18};
      int[] nums1={1,5,4,3,2};
        System.out.println(minSwaps(nums));
    }
}
