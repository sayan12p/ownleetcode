package first;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public static List<List<Integer>> combinationSum(int[] candiates,int target){
        Arrays.sort(candiates);
        List<List<Integer>> subset=new ArrayList<>();

        dfs(subset,0,candiates,new ArrayList<>(),target);
        return subset;
    }
    public static void dfs(List<List<Integer>> subset,int index,int[] candiates,List<Integer> current,int target){


        if(target<0) return;
        else if(target==0){
            subset.add(new ArrayList<>(current));
            return;
        }
        for(int i=index;i<candiates.length;i++){

            if(i >index && candiates[i]==candiates[i-1]) continue;// to remove duplicates
            current.add(candiates[i]);
            dfs(subset,i+1,candiates,current,target-candiates[i]);

            current.remove(current.size()-1);
        }
    }
    public static void main(String args[]){
        int nums[]={10,1,2,7,6,1,5};
        List<List<Integer>> result=combinationSum(nums,8);
        System.out.println(result.toString());
    }
}
