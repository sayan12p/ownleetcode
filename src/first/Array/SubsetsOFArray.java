package first.Array;

import java.util.ArrayList;
import java.util.List;

public class SubsetsOFArray {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> subset=new ArrayList<>();
        dfs(subset,0,nums,new ArrayList<>());
        return subset;
    }
    public static void dfs(List<List<Integer>> subset,int index,int[] nums,List<Integer> current){

        subset.add(new ArrayList<>(current));
        for(int i=index;i<nums.length;i++){
            current.add(nums[i]);
            dfs(subset,i+1,nums,current);
            current.remove(current.size()-1);
        }
    }
    public static void main(String args[]){
        int nums[]={1,2,3};
        List<List<Integer>> result=subsets(nums);
        System.out.println(result.toString());
    }
}
