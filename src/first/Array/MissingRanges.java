package first.Array;

import java.util.ArrayList;
import java.util.List;

public class MissingRanges {
    public static List<String> findMissingRanges(int[] nums, int lower, int upper) {
    int prev=lower-1;
    List<String> result=new ArrayList<>();

    for(int i=0;i<nums.length;i++) {
        int current = (i < nums.length) ? nums[i] : upper + 1;
        if ((prev + 1) <= current - 1) {
            result.add((prev + 1) + "->" + (current - 1));

        }
          prev=current;
        }

    return result;
    }
    public static void main(String[] args) {
      int[] nums=new int[]{0,1,3,50,75};
      int lower=0;
      int upper=99;
        System.out.println(findMissingRanges(nums,lower,upper).toString());
    }
}
