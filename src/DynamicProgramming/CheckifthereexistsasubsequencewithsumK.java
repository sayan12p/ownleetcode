package DynamicProgramming;


import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class CheckifthereexistsasubsequencewithsumK {
    public static boolean checkSubsequenceSum(int[] nums, int k) {
        //your code goes here
        List<Integer> list=Arrays.stream(nums).boxed().collect(Collectors.toList());
        int n=list.size();
        HashSet<Integer> subset=new HashSet<>();
        checkSubsequenceSumhelper(0,0,nums,n,subset);
        return subset.stream().anyMatch(s->s.equals(k));
    }

    private static void checkSubsequenceSumhelper(int index, int sum, int[] nums, int n, HashSet<Integer> subset) {

        if(index==n){
            subset.add(sum);
            return;
        }
        checkSubsequenceSumhelper(index+1,sum+nums[index],nums,n,subset);
        checkSubsequenceSumhelper(index+1,sum,nums,n,subset);
    }

    public static void main(String[] args) {
        int[] nums=new int[]{1, 2, 3, 4, 5};
        System.out.println(checkSubsequenceSum(nums,8));
    }
}
