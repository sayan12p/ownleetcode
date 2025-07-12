package first.Array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxConsecGoodNumbers {

    static int maxgoodnumbers(int[] nums,int[] goodnumbers){
        int i=0; int j=i+1;int l=nums.length-1;
        List<Integer> collect = Arrays.stream(goodnumbers).boxed().collect(Collectors.toUnmodifiableList());
        while(i<=l && j<=l && !(collect.contains(nums[i]) && collect.contains(nums[j])) ) {
            i++;
            j++;
        }
        return j-i+1;
    }
    public static void main(String[] args) {
        int[] nums={4, 8, 1, 2, 0, 4, 6};
        int[] goodnumbers={1, 4, 2, 6};
        System.out.println(maxgoodnumbers(nums,goodnumbers));
    }
}
