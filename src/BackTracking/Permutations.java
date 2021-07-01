package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        //https://www.youtube.com/watch?v=R3Sm9V2OSCo
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        boolean visited[]=new boolean[nums.length];
        backtrack(result,visited,new ArrayList<>(),nums);
        return result;
    }

    private static void backtrack(List<List<Integer>> result, boolean[] visited, ArrayList<Integer> subset, int[] nums) {
        if(nums.length==0) {
            result.add(subset);
            return;
        }
        else if(nums.length==1){
            subset.add(nums[0]);
            result.add(subset);
            return;
        }
        if(subset.size()==nums.length){
            result.add(new ArrayList<>(subset));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]==true) continue;
            subset.add(nums[i]);
            visited[i]=true;
            backtrack(result,visited,subset,nums);
            subset.remove(subset.size()-1);
            visited[i]=false;
        }
    }

    public static void main(String[] args) {
    int[] nums=new int[]{1,1,2};
        System.out.println(permute(nums));
    }
}
