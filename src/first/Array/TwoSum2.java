package first.Array;

import java.util.Arrays;

public class TwoSum2 {
    public static int[] twoSum(int[] numbers, int target) {
        int l=0,r=numbers.length-1;
        while (l<r){
            int sum=numbers[l]+numbers[r];
            if(sum>target)
                r--;
            else if(sum<target)
                l++;
            else return new int[]{l,r};
        }
        return new int[0];
    }
    public static void main(String[] args) {
        int numbers[]={2,3,4,7};
        int target=8;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
}
